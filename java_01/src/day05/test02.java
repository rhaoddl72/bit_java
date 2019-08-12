package day05;

import java.util.Arrays;

public class test02 {

	public static void main(String[] args) {
		int[] scores = {77,99,100,85,91};
		int[] sc = new int[scores.length*2];
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(sc));
		
		System.arraycopy(scores, 0, sc, 0,scores.length);
		//없다면 호출 있으면 그대로
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(sc));
		
		String[] names = {"홍길동", "박길동", "고길동", "최길동"};
		String[] na = new String[names.length*2];
		System.arraycopy(names, 0, na, na.length-names.length, names.length);
		                            //na - names 4번째 수부터 표시
		System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(na));
	}

}
