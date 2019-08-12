package day08;

public class card {
	
	
	final static int WIDTH = 100; //공유할떄 static필요
	// final 수정못하게 해줌
	final static int HEIGHT = 250;// 공유할때 static필요 메모리자동등록
	String kind = "다이아몬드";
	int number; // 인스턴스 배리어블 메모리수동등록
	
	public static void main(String[] args) {
		System.out.println(WIDTH + "*" + HEIGHT );
		System.out.println(new card().kind); //new해서 접근시켜줘야함
	}
	
		

	

}
