package day06;

public class test03 {

	public static void main(String[] args) {
		
           int num;
           String name;
           
           Employee emp1 = new Employee();
		/*
		 * System.out.println(emp1.ages+":"+emp1.name+":"+emp1.dept); emp1.display();
		 */
           
           Employee emp2 = new Employee();
		
           emp2.setAge(31);
           emp2.setName("홍길동");
           emp2.setDept("인사부");
          emp2.display();
		  //emp2.ages = -15; emp2.name = "홍길동"; emp2.dept = "인사부";
		  //System.out.println(emp2.ages+":"+emp2.name+":"+emp2.dept); emp2.display();
		 
           
           Employee emp3 = new Employee();
           
           emp3.setAge(28);
           emp3.setName("고길동");
           emp3.setDept("영업부");
           emp3.setSingle(true);
           emp3.display();
		/*
		 * emp3.ages = 20; emp3.name = "고길동"; emp3.dept = "영업부";
		 * System.out.println(emp3.ages+":"+emp3.name+":"+emp3.dept); emp3.display();
		 */
	}

}
