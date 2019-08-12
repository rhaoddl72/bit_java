package day13;

public class SingleTest {
	public static void main(String[] args) {
	
		singleton s1 = singleton.getinstance();
		singleton s2 = singleton.getinstance();
		singleton s3 = singleton.getinstance();
	}
	

}



class singleton{
	private static singleton s = new singleton();
	
	
	private singleton() {
		//private 외부 객체 생성 불가
		System.out.println("singleton() 생성");
	}
	public static singleton getinstance() { 
		if(s == null) s = new singleton();
		
		return s;
	
}



}

