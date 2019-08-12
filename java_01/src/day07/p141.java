package day07;

import java.util.Arrays;

public class p141 {

	public void increase(int[] n) {
		for(int i=0; i<n.length; i++) {
			n[i]++;
		}
	}
	public static void main(String[] args) {
		
		
		int[] data = {10,100,1000};	
		System.out.println(Arrays.toString(data));
		p141 p = new p141();
		p.increase(data);
		System.out.println(Arrays.toString(data));
	}
}
