package day13;

import java.util.Calendar;
import java.util.Formatter;

public class Test01 {

	public static void main(String[] args) throws Exception {
		Calendar c = Calendar.getInstance();
		System.out.println(c);

		String data = String.format("현재시간은 %tk 시 : %tm 분 : %tS초 %n",c,c,c);
		System.out.println(data);
		
		System.out.printf("%f",Math.PI);
		String f = String.format("%f",Math.PI);
		
		StringBuffer sb = new StringBuffer();
		Formatter fm = new Formatter("sss.txt");
		                             //sss - 저장파일이름
		fm.format("현재시간은 %tk 시 : %tm 분 : %ts 초 %n",c,c,c);
		
		System.out.println(sb);
		fm.flush();
		//flush 로그파일만들때
		
		
		System.out.println("main end");
	}

}
