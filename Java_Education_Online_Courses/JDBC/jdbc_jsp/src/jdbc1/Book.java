package jdbc1;

public class Book {
	private int id;
	private String title;
	private String description;
	private int isbn;
	
	public Book(){}

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

	public String getDesription() {
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
