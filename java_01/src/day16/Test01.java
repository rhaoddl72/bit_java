package day16;

import java.util.InputMismatchException;

public class Test01 {

	public static void main(String[] args) {

		System.out.println(" main start");
		int a = 10 , b = 0;
		
		try {
			System.out.println(1);
		System.out.println(a/b); // throw new ArithmeticExcption() 예외 발생
		System.out.println(2);
		} catch (InputMismatchException e) {
			//예외처리  try catch 구문에 오류부분넣어줌
			System.out.println("예외 발생 :"+e.getMessage());
			e.printStackTrace();
			//?
            System.out.println(3);
            //예외 발생하면 catch로 가서 syso.print에서 처리
		}finally {
			System.out.println("finally {항 상 수 행 } ");
		}
		
		//ArithmeticException  //RuntimeException 의 자식
		//NullPointerException  //RuntimeException  자식
        //IndexOutOfBoundsException  //RuntimeException 자식		
		
		//System.out.println("====================");
		
		//if(b != 0) System.out.println(a/b);
        
        System.out.println(" main end");
	}

}
