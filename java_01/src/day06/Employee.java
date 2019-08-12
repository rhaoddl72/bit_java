package day06;

public class Employee {
	//데이터(변수)+기능(메소드)
    //이름,부서,사번 = 데이터
	// public은 패키지 공용가능 public없으면 패키지가 다를 시 지정안됨
	// 같은 패키지에 있어야 접근 가능
	private String name;
	private String dept;
	private int ages; //data hidden
	  
	  private boolean single;
	 
	 public void display() {
		   //void는 뒤에 데이터가 없는것 그냥돌아갈때 ex)return();리턴뒤 가로에 값있으면안됨      //display에()꼭필요
		 System.out.printf("[나이:%-10s,이름:%-10s,부서:%-10s,싱글:%s]%n",this.ages,this.name,this.dept,this.single);
		 return;
	 }
	
	 public void setAge(int age) {
		 if(!(age>0 && age <= 100)) {
			 System.out.println("age 정보가 올바르지 x");
			 return;
		 }
		 this.ages = age;
		 return;
	 }
	 public int getAge() {
		 return ages; // void아니므로 반환값이 있다.
	 }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public boolean isSingle() {
		return single;
		//boolean get대신 is로 바뀐다.
	}

	public void setSingle(boolean single) {
		this.single = single;
	}
}
