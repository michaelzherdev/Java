package connection;

public class Main {

	public static void main(String[] args) {
		DBConnection connect = new DBConnection("localhost", "root", "", "test");
		connect.initProperties();
		connect.init();
	}

}
