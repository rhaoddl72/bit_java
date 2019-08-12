package day08;
/**
 * 
 * @author kms
 * @since 2019 07월 16
 * @version 1.0
 *
 */
public class Employee {
	
	static String cName = "bit";
	private String name;
	private String dept;
	private boolean single;
	
	public Employee() {
		//System.out.println("Employee() call");
		                   // 생성장소의역할 초기화 작업을 주로 한다.
		//this.name = "사원이름";
		//this.dept = "ooo 부서";
		//this.single = true;  //default생성자 기본생성자
	    this("사원이름","ooo 부서",true); //나의 또다른생성자 생성할때 this함수
	}
	
	
	public Employee(String name,String dept,boolean single) {
		//defaSystem.out.printf("Employee(%s,%s,%s) call%n",name,dept,single);
		                   
		this.name = name;
		this.dept = dept;
		this.single = single;}
		
	
	public  Employee(String name, String dept) {
		//System.out.printf("Employee(%s,%s) call%n",name,dept);
		//this.name =name;
		//this.dept = dept;
		this(name,dept, false); //this로 표현가능
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
		int num = 9;
		this.dept = dept;
	}
	public boolean isSingle() {
		return single;
	}
	
	/**
	 * 
	 * @param single 미혼기혼?
	 */
	
	public void setSingle(boolean single) {
		this.single = single;
	}
	/**
	 *  employee 정보출력
	 */
	public void print() 
	{
		//System.out.printf("[사원명 :%s 근무부서:%s single:%s]%n",name,dept,single);
       // System.out.println("회사명:" + cName); //static heap영역 못감		
	}

}
