package day02;

import java.util.Scanner;

public class test06 {

	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        
        System.out.println("학생 이름을 입력하세요:");
        String name = input.nextLine();
		
        System.out.println("점수를 입력하세요:ex)50");
        int scare = input.nextInt();
        
        System.out.printf("이름: %s, 점수 : %d %n", name,scare);
        
        input.close();
        input = null;
	}

}
