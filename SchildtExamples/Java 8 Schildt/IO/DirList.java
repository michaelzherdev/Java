package ch20;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class DirList {

	public static void main(String[] args) throws IOException {
		String dirName = "C:/Program Files/Java/jdk1.7.0_79";
		File f1 = new File(dirName);
		FilenameFilter only = new OnlyExt("html");
		System.out.println(f1.getCanonicalPath());
		if(f1.isDirectory()) {
			System.out.println("Catalog: " +  dirName);
			String s[] = f1.list(only);
			
			for( int i = 0; i < s.length; i++) {
				File f = new File(dirName + "/" + s[i]);
				if(f.isDirectory()){
					System.out.println(s[i] + " isCatalog");
				} else {
					System.out.println(s[i] + " isFile");
				}
			}
		} else {
			System.out.println(dirName + " isCatalogs");
		}
	}

}
