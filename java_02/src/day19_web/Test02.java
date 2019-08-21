package day19_web;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test02 {

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

		//System.out.println(map);
		
		System.out.println("admin => pw? " + map.get("admin"));
		                   //map에서 값(패스워드)물어봄
		                   //hashmap은 키값을 찾아내는데 빠른구조 set,arraylist도 쓸수있지만 서치속도가map이빠름
		System.out.println("java01 => pw? " + map.get("java01"));
		System.out.println("java09 => pw? " + map.get("java09"));
		System.out.println("test01 => pw? " + map.get("test1"));
		System.out.println("====================================");
		
		Set<String> keynames = map.keySet();
		                           //키이름만 뽑아와서 set구조로 리턴
		Iterator<String> it = keynames.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("ID :" +key+", pw :"+map.get(key));
		}
	}

}
