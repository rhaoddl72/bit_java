package day07;
/**
 * 
 * @author kms
 * @since 2019 07월 16
 * @version 1.0
 *
 */
public class Employee {
	
	private String name;
	private String dept;
	private boolean single;
	
	public Employee() {
		System.out.println("Employee() call");
		                   // 생성장소의역할 초기화 작업을 주로 한다.
		name = "사원이름";
		dept = "ooo 부서";
		single = true;
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
		System.out.printf("[사원명 :%s 근무부서:%s single:%s]%n",name,dept,single);
	}

}
