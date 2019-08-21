package java_02_ex;

import java.util.Scanner;

public class BookApp {
	

	static int num = 0;
	public static void main(String[] args) {
		BookMgr mgr = new BookMgr();
		Scanner input = new Scanner(System.in);
		while (true) {
		System.out.println("********* 명령 선택 *********");
		System.out.println("1. book등록 /n");
		System.out.println("2. book삭제 /n");
		System.out.println("3. book목록출력 /n");
		System.out.println("4. book목록검색 /n");
		System.out.println("5. quit /n");
		System.out.println("**************************");
		System.out.println("수행할 명령을 선택하세요!");
		System.out.println("1 2 3 4 5 중 하나를 선택하세요..");
		
		
		
		String cmd = input.nextLine();
		switch(cmd.trim()) {
		
		case "1":
				System.out.println("book 등록 작업 수행 중");
				System.out.println("boot title 입력");
				//input.nextLine();
				String title = input.nextLine();			
				System.out.println("boot 가격 입력");
				int price = input.nextInt();
				input.nextLine();
				
				mgr.addbook(new Book(++num,title,price));
				
				break;
			case "2":
				System.out.println("삭제할 책 제목을 입력하세요");
				title =input.nextLine();
				System.out.println("삭제 작업 수행 중");
				mgr.deletBook(title);
				
				
				break;
			case "3":
				System.out.println("목록 출력");
				mgr.booklistprint();
				break;
				
			case "4":
				System.out.println("목록 검색");
				
				title = input.nextLine();
				mgr.searchTitleBook(title);
				
				break;
			
			case "5":
                System.out.println("종료하려면 q/Q 입력");
                String quit = input.nextLine().trim();
                if(quit.equals("q") || quit.equals("Q")){
				System.out.println("종료 작업 중");
				input.close();
				input=null;
				return;
				//System.exit(0); // app종료
                }
                break;
                
				default:
					System.out.println("1234중하나");
					break;
				
				
		
		}
	}

}
}