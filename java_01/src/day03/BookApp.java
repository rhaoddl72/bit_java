package day03;

import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {
		while (true) {
		System.out.println("********* 명령 선택 *********");
		System.out.println("1. insert(등록)");
		System.out.println("2. delete(삭제)");
		System.out.println("3. update(수정)");
		System.out.println("4. quit(종료)");
		System.out.println("**************************");
		System.out.println("수행할 명령을 선택하세요!");
		System.out.println("1 2 3 4 중 하나를 선택하세요..");
		
		
		Scanner input = new Scanner(System.in);
		String cmd = input.nextLine();
		cmd = input.nextInt()+"";
		input.nextLine();
		//cmd = input.nextLine().trim();
		switch(cmd.trim()) {
		           //trim은 공백을 없애준다.
		
		case "1":
				System.out.println("등록 작업 수행 중");
				break;
			case "2":
				System.out.println("삭제 작업 수행 중");
				break;
			case "3":
				System.out.println("수정 작업 중");
				break;
			case "4":
                System.out.println("종료하려면 q/Q 입력");
                String quit = input.nextLine().trim();
                if(quit.equals("q") || quit.equals("Q")){
				System.out.println("종료 작업 중");
				input.close();
				input=null;
				//return;
				System.exit(0); // app종료
                }
                break;
                
				default:
					System.out.println("1234중하나");
					break;
				
				
		
		}
	}

}
}