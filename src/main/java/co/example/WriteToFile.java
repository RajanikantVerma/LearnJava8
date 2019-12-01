package co.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Stream;

public class WriteToFile {

	public static void main(String[] args) throws IOException {
		System.out.println("Read file line by line – Java 8 Stream");
		WriteToFile.readStreamOfLinesUsingFiles();
		System.out.println("Read file line by line – FileReader");
		WriteToFile.readLinesUsingFileReader();
		System.out.println("Read file as stream of lines – try-with-resources");
		WriteToFile.readStreamOfLinesUsingFilesWithTryBlock();

	}
	
	private static void readStreamOfLinesUsingFiles() throws IOException 
	{
	    Stream<String> lines = Files.lines(Paths.get("C:/Learning/Java8", "data.txt"));
	    Optional<String> hasPassword = lines.filter(s -> s.contains("password")).findFirst();
	    if(hasPassword.isPresent())
	    {
	        System.out.println(hasPassword.get());
	    } 
	    lines.close();
	}
	private static void readLinesUsingFileReader() throws IOException 
	{
	    File file = new File("C:/Learning/Java8/data.txt");
	    FileReader fr = new FileReader(file);
	    BufferedReader br = new BufferedReader(fr);
	    String line;
	    while((line = br.readLine()) != null)
	    {
	        if(line.contains("password")){
	            System.out.println(line);
	        }
	    }
	    br.close();
	    fr.close();
	}
	private static void readStreamOfLinesUsingFilesWithTryBlock() throws IOException 
	{
	    Path path = Paths.get("C:/Learning/Java8", "data.txt");
	    try(Stream<String> lines = Files.lines(path))
	    {
	        Optional<String> hasPassword = lines.filter(s -> s.contains("password")).findFirst();
	        if(hasPassword.isPresent()){
	            System.out.println(hasPassword.get());
	        }
	    }
	}
	private static void readStreamOfLinesUsingFilesWithTryBlock1() throws IOException 
	{
	    Path path = Paths.get("C:/Learning/Java8", "data.txt");
	 	    try(Stream<String> filteredLines = Files.lines(path).filter(s -> s.contains("password")))
	    {
	        Optional<String> hasPassword = filteredLines.findFirst();
	        if(hasPassword.isPresent()){
	            System.out.println(hasPassword.get());
	        }
	    }
	}
	private static void readStreamOfLinesUsingFilesWithTryBlock2() throws IOException 
	{
	    Path path = Paths.get("c:/temp", "data.txt");
	    try(Stream<String> filteredLines = Files.lines(path)
	                                    .onClose(() -> System.out.println("File closed"))
	                                    .filter(s -> s.contains("password"))){
	        Optional<String> hasPassword = filteredLines.findFirst();
	        if(hasPassword.isPresent()){
	            System.out.println(hasPassword.get());
	        }
	    }
	}

}
