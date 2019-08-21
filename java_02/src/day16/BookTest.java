package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		
			Scanner scanner = null;
			try {
			
			
			
				scanner = new Scanner(new File("c://lib//sample.txt"));
				while(scanner.hasNextLine()) {
					String[] data = scanner.nextLine().replace('_','/').split("/");
					
					Book book = null;
					try {
					 book = new Book(data[0], Integer.parseInt(data[1]));
					}catch (Exception e) {
						System.out.println(e.getMessage());
					}
					System.out.println(book);
				}
			}catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			finally {
				if(scanner != null) scanner.close();
				scanner=null;
				System.out.println("자원반납수행");
			}
			try {
				Book book = new Book("java", 90000);
				System.out.println(book);
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			System.out.println("end");
			
			

			
			
		}
				
			
		
	}


