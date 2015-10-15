package tables;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.*;



@Entity // говорит о представлении класса как таблицы бд
@Table(appliesTo = "book")
public class Book {
	@Id
	@Column(name="id")
//	@Generated(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="description")
	private String description;
	
	@Column(name="isbn")
	private int isbn;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	
	
}
