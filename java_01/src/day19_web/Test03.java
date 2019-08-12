package day19_web;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		//키값 value값관리 맵은 인터페이스            //TreeMap은 정렬
		map.put("java01", "1234");
		//put key,value입력함수
		map.put("java02", "1234");
		map.put("admin", "admin");
		map.put("test01", "test");
		for (int i=0; i<30; i++) {
			map.put("test" + i, (int)(Math.random()*10)+"00");
		}
	
 Scanner scanner = new Scanner(System.in);
 while(true) {
	 System.out.println("로그인 처리");
	 System.out.println("id/pw 형식으로 입력해주세요");
	 String data = scanner.nextLine();
	 String[] idpw = data.split("/");
	 String id = idpw[0];
	 String pw = idpw[1];
	 if(map.containsKey(id)) {
		 if(map.get(id).equals(pw)) {
			 System.out.println("로그인 성공");
			 break;
		 }else {
			 System.out.println("pw 불일치");
			 System.out.println("다시 로그인 하세요");
		 }
		 
	 }else {
		 System.out.println("id가 존재하지 않습니다.");
		 System.out.println("회원가입 후 이용하세요.");
	 }
 }
 System.out.println("이제부터 서비스 이용이 가능합니다.");
	}
}


