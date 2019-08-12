package day09;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Test01 {

	public static void main(String[] args) {
		//String msg2 = new String(new char[] {'g','h'});
		//String msg1 = "hello";
		//String msg3 = args[0];
		String msg1 = JOptionPane.showInputDialog("book 정보를 입력하세요 ex(title/가격)");
		//String msg = "java programing/23000";
		//showinputdialog syso처럼 시스템입력받아 출력
		//System.out.println(msg1);
		//System.out.println(msg1.toUpperCase());
		// 소문자 대문자로 바꿔줌 숫자는 바뀌지않음
 		//System.out.println(msg1);
 		
		System.out.println(msg1);
		
		if(msg1.indexOf("/") == -1) {
			
			System.out.println("다시 입력하세요");
			System.out.println("/가 필요합니다.");
           return;
		}
		
 		String[] data = msg1.split("/");
 		System.out.println(Arrays.toString(data));
        
 		Book b1 = new Book(data[0].trim(),Integer.parseInt(data[1].trim()));
        b1.print();		
	}

}
