package csvReadWrite;

import java.io.File;
import java.io.IOException;

import Controller.FileController;

public class Main {
	
	@SuppressWarnings("unused")
	public static void main(String [] args) throws IOException {
		
		// System.out.println("Hello World");
		
		FileController fileController = new FileController();
		
		File newFile = fileController.createFile("myNewFile");
		

		fileController.writeToFile(newFile, "Hello There :)");
	
		System.out.println(fileController.readFile(newFile));
		
		
		
		// System.out.println(newFile);
	}

}
