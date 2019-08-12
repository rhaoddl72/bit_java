package day09;
import java.util.Date;
public class test03 {

	public static void main(String[] args) {
			String msg =  "";
			msg = msg+ "hello " + new java.util.Date() + "java "+" test";
			System.out.println(msg);
			
			String msg2 = "";
			
			
			//StringBuffer sb = new StringBuffer();
			//옛날꺼
			StringBuilder sb = new StringBuilder();
			//string은 리사이징 불가능 하지만 stirngbuilder가변길이 값 줄수있음 
			
			
			sb.append("hello ");

			
			sb.append(new Date());
			sb.append("java");
			sb.append("test");
			sb.append("a");
			sb.append(89);
			
			//msg2 = sb.toString();
			msg2 = new String(sb);
			System.out.println(msg2);
			
	}

}
