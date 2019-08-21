package java_prob;

public class Test04 {

	public static void main(String[] args) {
		
		System.out.println("원 넓이(3.6) :" + circle(3.6));

	}
	
	public static double circle(double a) {
		final double PI = 3.14;
		
		return a*a*PI;
		
	}
	
	public static double circleenffp(double a) {
		final double PI = 3.14;
		
		return a*2*PI;
	}

}
