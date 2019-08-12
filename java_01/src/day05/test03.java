package day05;

import java.util.Arrays;

public class test03 {

	public static void main(String[] args) {
		String msg = "hello JAVA ~~~";
		String msg2 = "hi sql ~~~";
		
		char[] c = new char[msg.length()];
		for(int i =0; i<msg.length(); i++) {
			c[i] = msg.charAt(i);
		}   
             System.out.println(msg);
             System.out.println(Arrays.toString(c));
             
             char[] cc  = msg.toCharArray();
             cc[0]  = 'Q';
             
             String ne = new String(cc);
                                   //string대신 char가능 string은char의변형
             
             System.out.println(msg);
             System.out.println(Arrays.toString(c));
             System.out.println(Arrays.toString(cc));
             System.out.println(ne);
             
	}

}
