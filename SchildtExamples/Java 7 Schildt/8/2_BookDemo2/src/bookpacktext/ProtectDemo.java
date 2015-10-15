package bookpacktext;

class ExtBook extends bookpack.Book {
	private String publisher;
	
	public ExtBook(String t, String a, int d, String p) {
		super(t, a, d);
		publisher = p;
	}
	
	public void show () {
		super.show();
		System.out.println(publisher);
		System.out.println();
	}
	
	public String getPublisher() { return publisher; }
	public void setPublisher(String p) { publisher = p; }
	
/* Следующие операторы допустимы, поскольку подклассы имеют
 * право доступа к членам класса, объявленным защищенными
 */
	public String getTitle() { return title; }
	public void setTitle(String t) { title = t; }
	public String getAuthor() { return author; }
	public void setAuthor(String a) { author = a; }
	public int getPubDate() { return pubDate; }
	public void setPubDate(int d) { pubDate = d; }
}

class PtotectDemo {
	public static void main(String[] args) {
		//перед именем класса Book указывается имя пакета bookpack.
		ExtBook books[] = new ExtBook[5];
		books[0] = new ExtBook("Java: A Beginner`s Guide", "Shildt", 2011, "Osborne/McGraw-Hill");
		books[1] = new ExtBook("Java: The Complete Reference", "Shildt", 2011, "Osborne/McGraw-Hill");
		books[2] = new ExtBook("The Art Of Java", "Shildt and Holmes", 2011, "Osborne/McGraw-Hill");
		books[3] = new ExtBook("Red Storm Rising", "Clancy", 1986, "Putham");
		books[4] = new ExtBook("On The Road", "Kerouac", 1955, "Viking");
		
		for(int i = 0; i<books.length; i++)
			books[i].show();

		// искать книги по автору
		System.out.println("Showing all books by Shildt.");
		for(int i = 0; i<books.length; i++)
			if(books[i].getAuthor() == "Shildt")
				System.out.println(books[i].getTitle());
		// Доступ к защищенному полю за пределами подклассов не разрешается
		// books[0].title="test title"; // Oшибка: доступ запрещен
	}
}
