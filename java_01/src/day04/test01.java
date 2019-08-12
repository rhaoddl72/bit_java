package day04;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		System.out.println("알파벳 아스키 코드 값 확인");
	    char a = 'a', b= 'A';
	    for(int i=0;i<26;i++) {
	    System.out.println(a+ " : " +(int)a++ + "," +b+ ":"+(int)b++);
	   
	    }
	    Scanner input = new Scanner(System.in);
	    System.out.println("문자열을 입력하세요.");
	    String msg = input.nextLine();
	    
	    for (int i = 0; ; i++) {
	    	
	    
	    char ch = msg.charAt(i); 
	    char s = (ch>='A' && ch<='Z') ? (char) (ch+32) : ch;
	    //System.out.println(ch + " => "+ s);
	    System.out.print(s);
	    //변수 ch에 저장된 문자가 대문자 인 경우에만 소문자로 변경하는 코드를 완성 합니다.
	    // 소문자 => 대문자 과제
	    // 대문자 => 소문자 과제
	    }
	    
	}

}
