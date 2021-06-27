package csvReadWrite;


import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
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
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("User-Agent", userAgent);
		int responseCode = con.getResponseCode();
		System.out.println("GET Response Code :: " + responseCode);
		
		if (responseCode == HttpURLConnection.HTTP_ACCEPTED) {
			BufferedReader in = new BufferedReader(new InputStreamReader(
					con.getInputStream()));
			
			String inputLine;
			StringBuffer response = new StringBuffer();
			
			while((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			
			//Print Result
			System.out.println(response.toString());
			
		}
		else {
			System.out.println("GET request not working");
		}
	}

}
