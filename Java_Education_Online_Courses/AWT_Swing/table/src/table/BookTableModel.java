package table;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.*;

import javax.swing.table.AbstractTableModel;

import com.mysql.jdbc.Connection;

public class BookTableModel extends AbstractTableModel{

	private static final long serialVersionUID = 3883320512766381209L;
	
	private int columnCount = 5;
	private ArrayList<String[]> dataArrayList;
	
	public BookTableModel() {
		dataArrayList = new ArrayList<String[]>();
		for(int i = 0; i < dataArrayList.size(); i++)
			dataArrayList.add(new String[getColumnCount()]);
	}
	
	@Override
	public int getColumnCount() {
		return columnCount;
	}

	@Override
	public int getRowCount() {
		return dataArrayList.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		String []rows = dataArrayList.get(rowIndex);
		return rows[columnIndex];
	}

	public void addDate(String []row){
		String []rowTable = new String[getColumnCount()];
		rowTable = row;
		dataArrayList.add(rowTable);
	}

	@Override
	public String getColumnName(int columnIndex) {
		switch(columnIndex){
		case 0: return "#id";
		case 1: return "title";
		case 2: return "isbn";
		case 3: return "description";
		}
		return "";
	}
	
	public void addData(ConnectionDb connect){
		ResultSet result = connect.resultSetQuery("SELECT * FROM book");
			while(result.next()) {
				String []row = {
						result.getString("id"),
						result.getString("title"),
						result.getString("isbn"),
						result.getString("description")
				};
				addData(row);
	}
			result.close();
}
}
