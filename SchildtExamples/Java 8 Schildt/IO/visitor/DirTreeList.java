package ch20.ch21.visitor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DirTreeList {

	public static void main(String[] args) {
		String dirname = "c:\\eclipse";
		System.out.println("Catalog tree from " + dirname + "\n");
		
		try {
			Files.walkFileTree(Paths.get(dirname), new MyFileVisitor());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
