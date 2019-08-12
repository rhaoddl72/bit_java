package day04;

public class test03 {

	public static void main(String[] args) {
		
		OUT: for(int j=1; j<=9; j++) {
		for(int i=2; i<=9; i++) 
		{
			if(i==5) break OUT;
			System.out.printf("%d*%d = %2d |", i, j, i*j );
			
		}
		System.out.println();
		}
	}

}
