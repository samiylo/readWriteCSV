package csvReadWrite;


import java.io.File;
import java.io.IOException;
import java.net.URL;

import Controller.FileController;

public class Main {
	
	public static String userAgent = "Opera";
	public static String getURL = "https://www.youtube.com/watch?v=bpAi70WWBlw";
	public static String postURL = "";
	public static String params = "";
	
	@SuppressWarnings("unused")
	public static void main(String [] args) throws IOException {
		
		sendGET();
		System.out.println("GET DONE :::");
		
		
	}
	
	public static void sendGET() throws IOException {
		URL obj = new URL(getURL);
	}

}
