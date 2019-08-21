package day15_ex;

import util.Myutil;
import static util.Myutil.rightPad;
public class Test01 {

	public static void main(String[] args) {
		util.Myutil.leftPad("java",10,'#');
		Myutil u = new Myutil();
		String s = u.leftPad("ejb", 15, '^'); // instance method
		System.out.println(s);
		System.out.println(Myutil.leftPad("java", 18, '#')); // static method
		System.out.println(rightPad("java", 18, '#')); // static method
		System.out.println(Myutil.add(4,5,6,7,8));
		
		
		

	}

}
