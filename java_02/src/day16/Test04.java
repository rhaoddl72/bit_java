package day16;

import java.io.IOException;



public class Test04 {

	public static void main(String[] args) {
		System.out.println("main start");
		int jumsu = 90; //밖에있을때는 finally에 접근할수 있지만 try문안에 들어오면 finally 접근불가 이게 스코프?
		
		
		try {
		//throw new 	RuntimeException("~~~~ 문제 발생 ~~~~~");
			if((jumsu >=0 && jumsu <= 100))
				
		throw new 	IOException("~~~~ 점수가 유효하지 않습니다. ~~~~~"); //예외 발생
		} catch (IOException e) {
			System.out.println(e.getMessage()); // 정상적으로 수행할 수 없을때 예외 발생
		} catch (Exception e) //위에서 거르지못하고 거르지못하면 exception에서 최종발생 
		{
			
		}finally {
			
		}
		
		
		
		
		System.out.println("main and");

	}

}
