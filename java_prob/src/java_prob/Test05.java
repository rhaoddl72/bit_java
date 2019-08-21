package java_prob;

public class Test05 {

	public static void main(String[] args) {
		
		for(int i=1; i<10; i++) {
			if(www(i)) {
				System.out.println(i);
			}
		}

	}
	
	
	public static boolean www(int a) {
		
		if(a==1) {
			return false;
		}
		
		
			for(int i=2; i<a; i++) {
				if(a%i==0) {
				
					return false;}
			}
			return true;
	}
			
	
	
}
