// Простая программа, демонстрирующая применения пакета
// Этот файл является частью пакета bookpack
package bookpack;

// Класс Book принадлежит пакету bookpack
public class Book {
	protected String title;
	protected String author;
	protected int pubDate;
	
	public Book(String t, String a, int d) {
		title = t;
		author = a;
		pubDate = d;
	}
	
	public void show() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(pubDate);
		System.out.println();
	}
}
/* Класс BookDemo принадлежит пакету boopack
public class BookDemo {
	public static void main(String[] args) {
		Book books[] = new Book[5];
		books[0] = new Book("Java: A Beginner`s Guide", "Shildt", 2011);
		books[1] = new Book("Java: The Complete Reference", "Shildt", 2011);
		books[2] = new Book("The Art Of Java", "Shildt and Holmes", 2011);
		books[3] = new Book("Red Storm Rising", "Clancy", 1986);
		books[4] = new Book("On The Road", "Kerouac", 1955);
		
		for(int i = 0; i<books.length; i++)
			books[i].show();
	}

}
*/
