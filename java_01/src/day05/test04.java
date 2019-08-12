package day05;

import java.util.Arrays;

public class test04 {

	public static void main(String[] args) {
		
		//System.out.println((int)(Math.random()*10)); //난수발생 
		//System.out.println(Math.random()); //난수발생 
		//String[] args = {};
		//String[] args = {5};
 		if(args.length == 0) {
			System.out.println("배열의 사이즈 정보를 실행 매개변수로 넘겨주세요");
			System.out.println("실행_예) java day05.test04 5");
            return;			
			
		}
		
		int[] nums = new int[Integer.parseInt(args[0])];
		for(int i=0;i<nums.length; i++) {
			nums[i] = (int) (Math.random()*45)+1;
			                                 //0부터시작이니까 +1은 0을 없애주기위해
		}System.out.println(Arrays.toString(nums));
		/// 정렬 SORT
		
		System.out.println("~~~~~~~~ 정렬");
		System.out.println(Arrays.toString(nums));
		
		System.out.println("~~~~~~~~~~~정렬");
		int count = 0;
		for(int i=0; i<nums.length-1; i++) {
			for(int j=i+1; j< nums.length; j++) {
				if(nums[i] < nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
					count++;
				}
				// 카운트 4까지만 나오게 과제
			}
			System.out.println("count ==" + count);
			System.out.println(Arrays.toString(nums));
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~정렬");
			
		}
		
		
	}

}
