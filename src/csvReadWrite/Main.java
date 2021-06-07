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
		
		System.out.println("Here in readFile ::: " + fileController.readFile(newFile));
		System.out.println("Here is the file path ::: " + newFile.getPath());
		System.out.println("Here in isAbsolute() ::: " + newFile.isAbsolute());
		System.out.println("Here in getAbsolutePath() ::: " + newFile.getAbsolutePath());
		//System.out.println("Here in getCanonicalPath ::: " + newFile.getCanonicalPath());
		
		
		// Delete on exit
		System.out.println("Here in delteOnExit() ::: " + newFile.deleteOnExit(););
		
		
		
		// System.out.println(newFile);
	}

}
