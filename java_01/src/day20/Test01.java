package day20;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class Test01 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);

		list.forEach(i -> System.out.println(i + "   "));
		System.out.println();
		list.removeIf(i -> i % 2 == 0);
		list.forEach(i -> System.out.println(i + "   "));

		System.out.println("/n=====================/n");

		List<Employee> emp = new ArrayList<Employee>();

		emp.add(new Employee(2017001, "홍길동", "영업부"));
		emp.add(new Employee(2018002, "고길동", "영업부"));
		emp.add(new Employee(2017011, "이길동", "마케팅부"));
		emp.add(new Employee(2019011, "박길동", "영업부"));

		System.out.println(emp.stream().filter(i -> i.getNumber() > 2018002).count());

		emp.stream().filter(i -> i.getNumber() > 2018002).forEach(i -> System.out.println(i));

		Employee[] e = { new Employee(2017001, "홍길동", "영업부"), new Employee(2018002, "고길동", "영업부"),
				new Employee(2017011, "최길동", "마케팅부"), new Employee(2019011, "이길동", "영업부") };

		System.out.println("=========arrays stream처리====");
		Stream.of(e).filter(i -> i.getDept().equals("영업부")).forEach(i -> System.out.println(i));
		// 배열을 stream으로 바꾼후 영업부 사워만 추출하여 출력

		System.out.println();
		/*Stream.of(e).sorted().forEach(i -> System.out.println(i));
		
		Stream.of(e).sorted(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		}).forEach(i -> System.out.println(i));*/
		
		System.out.println("=============람다");
		Stream.of(e)
		.sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
		.forEach(i -> System.out.println(i));
	}

}
