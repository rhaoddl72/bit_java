package day17;

public class Test01 {

	public static void main(String[] args) {
		Book1 b1 = new Book1("java",900);
		//Book b1 = new Book();
		//<>해주지않으면 타입에대해 정의하지않으면  자동 오브젝트 처리 T => objcet
		System.out.println(b1);
		
		Book1<Double> b2 = new Book1<Double>("sql", 700.0);
		System.out.println(b2);
		
		Book1<Integer> b3 = new Book1<Integer>("jsp", 1000);
		System.out.println(b3); 

	}

}
