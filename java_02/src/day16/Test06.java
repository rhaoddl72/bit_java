package day16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test06 {

	public static void main(String[] args) {
		System.out.println("main start");
        FileInputStream fis = null;
		
		
		try {
		     fis = new FileInputStream("c://lib//sampleㄷ.txt"); //수행하다 문제 발생할시 
			System.out.println("파일 준비 완료~~~");
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage()); // 예외발생하면 이쪽
			System.out.println("sample.txt 파일을 확인해 주세요");
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(fis != null) fis.close(); //위에 sample이름 오류나서 null값이 안되므로 !=줘서 자원반납시킴
				fis = null;
				System.out.println("자원반납 완료");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		System.out.println("main and");
	}

}
