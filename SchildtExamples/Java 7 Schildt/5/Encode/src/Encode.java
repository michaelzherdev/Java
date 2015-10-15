// Использование операции поразрядного исключающего ИЛИ
// для шифрования и дешифрования сообщений
public class Encode {
	public static void main(String[] args) {
		String msg = "This is a test";
		String encmsg = "";
		String decmsg = "";
		int key = 88;
		
		System.out.println("Original message: " + msg);
		
		// шифровка сообщения
		for (int i=0; i<msg.length(); i++)
		// построение зашифрованной строки сообщения
		encmsg = encmsg + (char)(msg.charAt(i) ^ key);
		System.out.println("Encoded message: " + encmsg);
		
		// дешифровать сообщение
		for (int i=0; i<msg.length(); i++)
		// построение дешифрованной строки сообщения
		decmsg = decmsg + (char)(encmsg.charAt(i) ^ key);
		System.out.println("Decoded message: " + decmsg);
	}

}
