package day03;

public class test01 {

	public static void main(String[] args) {
		// == : 기본형의 값이 같은 지 비교,
        // equals() : 참조형 데이터가 같은지 비교
		
		int num1 = 99;
		int num2 = 99;
		
	    String name1 = "홍길동";
	    String name2 = "홍길동";
	    
	    String msg1 = new String("Hello");
	    String msg2 = new String("Hello");
	    
	    System.out.println("num1==num2 => "+(num1==num2));
	    //System.out.println("name1==name2 => "+name1==name2);
	    System.out.println("name1==name2 => "+name1.equals(name2));
	    System.out.println("msg1==msg2 => "+(msg1.equals(msg2)));
	                                              //->메세지1과 메세지2과 같은지 비교 참조형은 equals로 비교 ==사용ㄴㄴ
	    System.out.println("msg1==msg2 => "+msg1.equals(msg2));
        msg1 = msg2;
        
        
	}

}

