package ch20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class NIOCopy {

	public static void main(String[] args) {
		try {
		Path source = Paths.get("TEST.txt");
		Path target = Paths.get("test.dat");
		
			Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
