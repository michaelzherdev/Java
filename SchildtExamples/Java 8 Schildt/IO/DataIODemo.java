package ch20;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIODemo {

	public static void main(String[] args) {
		try ( DataOutputStream dout = new DataOutputStream(new FileOutputStream("Test.dat"))) {	
			dout.writeDouble(98.6);
			dout.writeInt(1000);
			dout.writeBoolean(true);
			} catch(IOException e) {}
	
		try ( DataInputStream din = new DataInputStream(new FileInputStream("Test.dat"))) {	
			double d = din.readDouble();
			int i  = din.readInt();
			boolean b = din.readBoolean();
			System.out.println("Result: " + d + i + b);
		}catch(IOException e) {}
}
}
