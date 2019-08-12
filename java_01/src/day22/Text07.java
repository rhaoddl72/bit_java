package day22;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Text07 {

	public static void main(String[] args) {
		
		//FileReader fr = null;
		//BufferedReader br = null;
		Properties porp = new Properties();
		FileReader fr = null;
		
		
		
		
		
		try {
		fr = new FileReader("c://lib//dbinfo.txt");
		porp.load(fr);
		String id = porp.getProperty("user");
		String pw = porp.getProperty("pw");
		System.out.println("로그인 시도 " + id + "/" + pw);
		//br = new BufferedReader(fr);
		
		/*String id = null;
		String pw = null;
		
		String read = null;
		
		while ((read = br.readLine()) != null) {
			String[] data = read.split("=");
			if(data[0].equals("user")) id = data[1];
			if(data[0].equals("pw")) pw = data[1];
		}*/
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			
				
				
			
		}
		

	
	}
}
