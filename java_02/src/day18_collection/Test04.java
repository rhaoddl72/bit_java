package day18_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test04 {

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


class Employee implements Comparable<Employee> {
	int number;
	String name;
	String dept;
	
	
	
	@Override
	public String toString() {
		return "Employee [number=" + number + ", name=" + name + ", dept=" + dept + "]";
	}












	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + number;
		return result;
	}



	









	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (dept == null) {
			if (other.dept != null)
				return false;
		} else if (!dept.equals(other.dept))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number != other.number)
			return false;
		return true;
	}












	public Employee() {
		super();
	}
	
	










	public Employee(int number, String name, String dept) {
		super();
		this.number = number;
		this.name = name;
		this.dept = dept;
	}












	@Override
	public int compareTo(Employee o) {
		return number - o.number;
	}
	
	
	
	
	
}