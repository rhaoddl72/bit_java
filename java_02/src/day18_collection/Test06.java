package day18_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test06 {

	public static void main(String[] args) {
		
		
		
		Set<Employee> set = new TreeSet<Employee>();
		//set.add(new Employee(2017001,"홍씨", "영업부"));
		boolean flag = set.add(new Employee(2017001,"홍씨","영업부"));
		if(flag) System.out.println("등록 되었습니다.");
		
		
		
		 flag = set.add(new Employee(2017001,"홍씨","영업부"));
		if(!flag) System.out.println("이미 존재하는 데이터입니다.");
		
		
		
		set.add(new Employee(2018001,"김씨", "기술부"));
		set.add(new Employee(2019001,"박씨", "마케팅부"));
		set.add(new Employee(2019003,"이씨", "영업부"));
		
		// set 목록 출력
		System.out.println(" 사원 목록");
		Iterator<Employee> it = set.iterator();
		while (it.hasNext()) {
			Employee data = it.next();
			System.out.println(data.toString());
		}

		//2018001 사번의 사원을 검색 출력
		
		it = set.iterator();
		System.out.println("2018001 검색 결과입니다.");
		while (it.hasNext()) {
			Employee data = it.next();
			if(data.number == 2018001) {
				System.out.println(data);
			}
	
		}
		
		
		
	}

}





	

