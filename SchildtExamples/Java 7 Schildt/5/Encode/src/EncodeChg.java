// ������������� �������� ������������ ������������ ���
// ��� ���������� � ������������ ��������� (changed)
public class EncodeChg {
	public static void main(String[] args) {
		String msg = "This is a test";
		String encmsg = "";
		String decmsg = "";
		String key = "abcdefgi";
		int j;
		
		System.out.println("Original message: " + msg);
		
		// �������� ���������
		j = 0;
		for (int i=0; i<msg.length(); i++)
		encmsg = encmsg + (char)(msg.charAt(i) ^ key.charAt(j));
		j++;
		if (j==8) j=0;
		System.out.println("Encoded message: " + encmsg);
		
		// ����������� ���������
		j=0;
		for (int i=0; i<msg.length(); i++)
		decmsg = decmsg + (char)(encmsg.charAt(i) ^ key.charAt(j));
		j++;
		if (j==8) j=0;
		System.out.println("Decoded message: " + decmsg);
	}

}
