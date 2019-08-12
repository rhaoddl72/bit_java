package day06;

public class test04 {

	public static void main(String[] args) {
		
		
       Employee emp1 = new Employee();
       
		
		
		
		
		Employee emp2 = new Employee();
			
         emp2.setAge(51);
         emp2.setName("홍길동");
         emp2.setDept("인사부");
         emp2.display();
        
        
        
        
        Employee emp3 = new Employee();
        
        emp3.setAge(33);
        emp3.setName("고길동");
        emp3.setDept("영업부");
        emp3.setSingle(true);
        emp3.display();
        
        
        
        
        Employee emp4 = new Employee();
        
        emp4.setAge(31);
        emp4.setName("김길동");
        emp4.setDept("영업부");
        emp4.setSingle(true);
        emp4.display();
		
		
		
		Employee[] emp = {emp2,emp3,emp4};
		double sum = 0;
		int count = 0;
		
		for(int i=0; i<emp.length; i++) {
			//System.out.println(data.getDept());
			if(emp[i].getDept() != null && emp[i].getDept().equals("영업부")) {
				sum += emp[i].getAge();
				count++;
				
				emp[i].display();	
			}
			
		}
		System.out.printf("영업부 평균 급여 = %.2f %n",sum/count);
		System.out.println("싱글만");
		for(int i=0; i<emp.length; i++) {
			if(emp[i].isSingle()) {
				//boolean은 get이 is로
			emp[i].display();
		}
			

	}

}
}