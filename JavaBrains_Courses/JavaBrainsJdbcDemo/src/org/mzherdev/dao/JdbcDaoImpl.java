package org.mzherdev.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.mzherdev.model.Circle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

@Component
public class JdbcDaoImpl {
	
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate = new JdbcTemplate();;
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public Circle getCircle(int circleId) {
		Connection conn = null;
		
		try{

//			Class.forName("com.mysql.jdbc.Driver").newInstance();
//			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "root");
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM circle where id = ?");
			ps.setInt(1,  circleId);
			
			Circle circle = null;
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				circle = new Circle(circleId, rs.getString("name"));
			}
			rs.close();
			ps.close();
			return circle;
		}catch(Exception e) {
			throw new RuntimeException();
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public int getCircleCount() {
		String sql = "select count(*) from circle";
//		jdbcTemplate.setDataSource(dataSource);
		return jdbcTemplate.queryForInt(sql);
	}

	public DataSource getDataSource() {
		return dataSource;
	}


	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}



	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}



	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public String getCircleName(int circleId) {
		String sql = "select name from circle where id = ?";
//		jdbcTemplate.queryForObject(sql, String.class);
		jdbcTemplate.queryForList(sql, new Object[] {circleId}, String.class);
		return jdbcTemplate.queryForObject(sql, new Object[] {circleId}, String.class);
	}
	
	//with rowMapper:
	public Circle getCircleForId(int circleId) {
		String sql = "select * from circle where id = ?";
		return jdbcTemplate.queryForObject(sql, new Object[] {circleId}, new CircleMapper());
		
	}
	
	public List<Circle> getAllCircles() {
		String sql = "select * from circle";
		return jdbcTemplate.query(sql, new CircleMapper());
		
	}
	
	private static final class CircleMapper implements RowMapper<Circle> {

		@Override
		public Circle mapRow(ResultSet resultSet, int rowNum) throws SQLException {
			Circle circle = new Circle();
			circle.setId(resultSet.getInt("ID"));
			circle.setName(resultSet.getString("NAME"));
			return circle;
		}
		
	}
	
	public void insertCircle(Circle circle) {
		String sql = "insert into circle(id, name)"
				+ " values (?, ?)";
		jdbcTemplate.update(sql, new Object[]{circle.getId(), circle.getName()});
		SqlParameterSource namedParameters = new MapSqlParameterSource("id", circle.getId())
					.addValue("name", circle.getName()); 
		namedParameterJdbcTemplate.update(sql, namedParameters);
	}
	
	public void createTriangleTable() {
		String sql = "create table triangle(id int, name varchar(50))";
	
		jdbcTemplate.execute(sql);
	}
}
