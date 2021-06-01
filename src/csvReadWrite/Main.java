package csvReadWrite;

import java.io.File;

import Controller.FileController;

public class Main {
	
	@SuppressWarnings("unused")
	public static void main(String [] args) {
		
		System.out.println("Hello World");
		
		FileController fileController = new FileController();
		
		File newFile = fileController.createFile("myNewFile");
		
		System.out.println(newFile);
	}

}
