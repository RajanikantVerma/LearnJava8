package co.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileList {

	public static void main(String[] args) throws IOException {
		System.out.println("List all files and sub-directories using Files.list()");
		Files.list(Paths.get(".")).forEach(System.out::println);
		System.out.println("List only files inside directory using filter expression");
		Files.list(Paths.get(".")).filter(Files::isRegularFile).forEach(System.out::println);
		System.out.println("List files and sub-directories with Files.newDirectoryStream()");
		Files.newDirectoryStream(Paths.get(".")).forEach(System.out::println);
		System.out.println("List only files with Files.newDirectoryStream()");
		Files.newDirectoryStream(Paths.get("."), path -> path.toFile().isFile()).forEach(System.out::println);
		System.out.println("List files of certain extention with Files.newDirectoryStream()");
		Files.newDirectoryStream(Paths.get("."),path -> path.toString().endsWith(".xml")).forEach(System.out::println);
		System.out.println("Find all hidden files in directory");
		
	}

}
