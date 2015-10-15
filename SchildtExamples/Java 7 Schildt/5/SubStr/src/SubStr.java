// Применение метода substring()
public class SubStr {
	public static void main(String[] args) {
		String orgstr = "Java makes the Web move.";
		
		// сформировать подстроку
		//Здесь создается новая строка, содержащая нужную подстроку
		String substr = orgstr.substring(5, 18);
		System.out.println("orgstr: " + orgstr);
		System.out.println("substr: " + substr);
	}

}
