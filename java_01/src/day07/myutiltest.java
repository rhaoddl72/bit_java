package day07;

import java.util.Arrays;

import util.myutil;

public class myutiltest {

	public static void main(String[] args) {
		//System.out.println(myutil.add(11, 99));
		//System.out.println(myutil.add(11.1, 99.2));
		
		
		//System.out.println(myutil.add(33.3, 99.2, 43));
		
		//System.out.println(myutil.add(33.3, 99.2, 43,21));
		//System.out.println(myutil.add(1, 2, 3,4,5,6,7,8,9));
		//System.out.println(myutil.add(new double[] {1, 2, 3,4,5,6,7,8,9}));
		                               //↑배열
		
		
		double[] d = new double[] {1,2,3,4,5,7};
		
	System.out.println(Arrays.toString(d));	
	
	
	//오토박싱 언박싱
	int i=100;
	//Integer ii = new Integer(100);
	Integer ii = i;
	ii = i;
	
    System.out.println(i+"  "+ii);
    System.out.println(myutil.max(1,2,3));
	}

}
