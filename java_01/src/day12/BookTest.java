package day12;

public class BookTest extends Book {

	public static void main(String[] args) {

		String msg1 = "hello";
		String msg2 = "hello";
		System.out.println(msg1.toString());
		System.out.println(msg1.equals(msg2));
		System.out.println(msg2.toString());
		
		
		
		
		Book b1 = new Book("java",2200);
		Book b2 = new Book("java",2200);
		System.out.println(b1.toString());
		System.out.println(b2.equals(b2));
		System.out.println(b2);
		
		//msg2 = null; //널값 
		//System.out.println(b1.equals(msg1));

		
		b1.close();
		b2.close();
		//자원반납 할때 자주 쓰임 

		b1 = null; //null 넣어줘야 메모리 누수 막아줄 수 있음(가비지 대상이되어 처리해줌) 
		b2 = null;
		
	   //System.gc();
	   
	   System.out.println("========= main end ==========");
	   
		
	}

}
