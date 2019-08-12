package day11;

public class Test02 {

	public static void main(String[] args) {
		Object[] P = {	new Student("홍길동",20,20121401),
			             new Teacher("이길동",30,"java"),
			             new Employee("박길동",50,"영업부")
	};
     
		for(Object data :P) {
			//data.printA(); //오브젝트니까 person데이터 못읽음
			System.out.println();
		}
		System.out.println("===========");
		
		for(Object data:P) {
			// 자식 명령의 자원을 접근할때는 다운 캐스팅 필요
			// 반드시 하단부에 어떤 객체가 바인딩 되어 있는지 타입 체크 필요
			if(data instanceof Student) ((Student)data).print();
			if(data instanceof Teacher) ((Teacher)data).print();
			if(data instanceof Employee) ((Employee)data).print();
			
			
		}
}
}
