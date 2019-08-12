package day07;

public class calc {
	
	static int data = 0;// 클래스 변수
	
	
	//클래스 메소드
	public static  long add(int a, int b) {
		System.out.println(calc.data); //calc.data접근가능  
		System.out.println(Math.random());
		return a+b;
	}
   public  static long sub(int a , int b) {
	   return a-b;
   }
   public static long multi(int a, int b) {
	   return a*b;
	   
   }
   public static long divide(int a, int b) {
	   if(b==0) return 0;
	   return a/b;
   }
}
