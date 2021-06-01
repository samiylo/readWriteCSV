package Controller;

import java.io.File;

public class FileController {
	
	
	public File createFile(String fileName) {
	
		
			System.out.println("In createFile() try/catch block");
			
			File newFile = new File(fileName);
			
			
			

		return newFile;
		
		
	}

}