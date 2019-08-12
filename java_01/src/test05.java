
public class test05 {

	public static void main(String[] args) {
		//for(조건값 ; 조건식 ; 증감식) {
		int i;
		for( i = 1 ; i<10 ; i++)
		   //위에 int가 있으므로 for문 안에 int적용하면안됨
		{
			System.out.println("hello java "+i);
			System.out.println(i);
		}
			
			
			int j = 10;
			while(j>0) {
				System.out.println("while" + j);
				j--;
			}
			
			boolean flag = true;
			while(flag) {
				j++;
				System.out.println("~~~~~~~~~"+j);
				if(j==5) flag = !flag;
			}
			System.out.println("j :" + j);
			
			while(j<5) {
				System.out.println("do while"); // 동작x
			}
			System.out.println("---------------------------");
			do {
				System.out.println("do while"); // 동작o
			
			}while(j<5);
		}
	}



