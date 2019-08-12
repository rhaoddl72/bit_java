package day03;

public class test05 {

	public static void main(String[] args) {
		
		// 1 ~ 100 합
		// 1+2 3 4 5 6
		
		int sum = 0;
		int sum4 = 0; //4의 배수
		for(int i = 1; i<=100;i++) {
			//sum = sum+i;
			sum += i;
			if(1%4 == 0) sum4 += i;
		}
		System.out.println("1-100합계" + sum);
		System.out.println("1-100 4의 배수 합계" + sum4);
	}

}
