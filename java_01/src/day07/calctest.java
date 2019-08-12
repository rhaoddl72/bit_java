package day07;

public class calctest {

	public static void main(String[] args) {
		
		calc c1 = new calc();
		System.out.println(c1.add(11, 99)); //인스턴스(객체)메소드
		
		
		//클래스메소드
		System.out.println(calc.sub(11, 99));
		System.out.println(calc.multi(11, 99));
		System.out.println(calc.divide(11, 99));
	
	}

}
