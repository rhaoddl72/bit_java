package day07;

public class p139 {
public static int increase(int n) {
	++n;
	return n;
}
	
	
	
	public static void main(String[] args) {
		
		int var1 = 100;
		int var2 = p139.increase(var1); 
		//var1  int n으로 들어가서 값받아줌  
		
		System.out.println(var1+"   "+var2);

	}

}
