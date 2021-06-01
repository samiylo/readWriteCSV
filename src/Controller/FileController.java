package Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileController {
	
	
	public File createFile(String fileName) {
		System.out.println("In createFile() :::");
			
		File newFile = new File(fileName); 
			
		return newFile;
		
	}
	
	public void writeToFile(File file, String info) throws IOException {
		System.out.println("In writeToFile() :::");
		
		FileWriter fileWriter = new FileWriter(file);
		fileWriter.write(info);
		fileWriter.close();
		
		System.out.println("Written to file and fileWriter closed :::");
	}
	
	public String readFile(File file) throws FileNotFoundException {
		System.out.println("In readFile() :::");
		String data = null;
		
			Scanner newScanner = new Scanner(file);
			
			while(newScanner.hasNextLine()) {
				data = newScanner.nextLine();
				
			}
	
		return data;
		
	}

}