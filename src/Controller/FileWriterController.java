package Controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterController {
	
	// Grabbing file name and directory using io.File
	
	String directory = System.getProperty("user.home");
	String fileName = "sample.txt";
	String absolutePath = directory + File.separator + fileName;
	
	try(FileWriter fileWriter = new FileWriter(absolutePath)) {
		
		String fileContent = "This is sample text";
		fileWriter.write(fileContent);
		fileWriter.close();
		
	} catch (IOException e) {
		System.out.println("Error in FileWriterController ::: " + e );
	}
	
	

}
