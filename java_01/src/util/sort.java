package util;

import java.util.Arrays;

public class sort {

	
		public static int[] sort(int[] nums) {
		     //배열 원본은 변경이 되지 않도록 하고
			// 오름차순으로 정렬된 int[]를 리턴한다.
	        //int[] data = {11,53,23,56,27,78};
	        //System.out.println(Arrays.toString(data));
			int[]  copy = new int[nums.length];
			System.arraycopy(nums, 0, copy, 0, nums.length);
			//int []  = 0;
			for(int i=0; i<copy.length-1; i++) {
				for(int j=i+1; j<copy.length; j++) {
					if(copy[i] > copy[j]) {
						int temp=copy[i];
						copy[i] = copy[j];
						copy[j] = temp;
					}
					
					
				}
			}
			
			return copy;
		}
		public static void main (String[] args) {
		
		int[] a = {11,53,23,56,27,78};
		
		int[] aa = sort.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(aa));
	}
}
