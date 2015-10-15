
package bookpacktext;

// использовать класс Book из пакета bookpack
class UseBook {
	public static void main(String[] args) {
		//перед именем класса Book указывается имя пакета bookpack.
		bookpack.Book books[] = new bookpack.Book[5];
		books[0] = new bookpack.Book("Java: A Beginner`s Guide", "Shildt", 2011);
		books[1] = new bookpack.Book("Java: The Complete Reference", "Shildt", 2011);
		books[2] = new bookpack.Book("The Art Of Java", "Shildt and Holmes", 2011);
		books[3] = new bookpack.Book("Red Storm Rising", "Clancy", 1986);
		books[4] = new bookpack.Book("On The Road", "Kerouac", 1955);
		
		for(int i = 0; i<books.length; i++)
			books[i].show();

	}

}
