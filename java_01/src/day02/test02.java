package day02;

public class test02 {

	public static void main(String[] args) {
		
		int a,b;
		a = b = 10;
		
		boolean c = ++a > b++ || a++ >= ++b;
		
		System.out.println(a+","+b);
		System.out.println("변수 c의 값 :"+c);
	}

}
