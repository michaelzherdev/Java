import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// MD5 saving password example
public class MD5 {

	public static void main(String[] args) {
		
			String hashtext = "0";
			String plaintext = "1987";
			try {
				MessageDigest m = MessageDigest.getInstance("MD5");
				m.reset();
				m.update(plaintext.getBytes());
				byte[] digest = m.digest();
				BigInteger bigInt = new BigInteger(1,digest);
				hashtext = bigInt.toString(16);
			}
			catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			}

			while (hashtext.length() < 32 ){
			  hashtext = "0" + hashtext;
			}
			
			System.out.println(hashtext);
	}

}
