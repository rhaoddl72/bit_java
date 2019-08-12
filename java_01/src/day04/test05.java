package day04;

import java.util.Arrays;

public class test05 {

	public static void main(String[] args) {
		//배열 선언 생성 초기화
		int[] scores = {88,99,100,22,55};
		String[] names = {"고길동","최길동","박길동","이길동","홍길동"};
		
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(names));
		
		
		if(names.length > 4) System.out.println(names[4]);
       System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
       
       for(String data :names) {
    	   System.out.println("**"+data.charAt(data.length()-1));
    	   
       }
       double sum = 0;
		for(int data:scores) {
			sum = sum+data;
		}
         System.out.printf("평균 = %.2f" , sum/scores.length);
	}

}
