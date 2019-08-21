package day_01_ex;

public class Prob13 {
	public String leftpad(String str, int size, char padchar) {
		if(str.length()>size) {
			return str;
		}
		int count = size-str.length();
		
		for(int i=0; i<count; i++) {
			str = padchar+str;
		}
		return str;
	}
	public static void main(String[] args) {
		Prob13 p = new Prob13();
		System.out.println( p.leftpad("bit", 6, '#') );
		System.out.println( p.leftpad("bit", 5, '$') ); 
		System.out.println( p.leftpad("bit", 5, '$') ); 
		System.out.println( p.leftpad("bit", 2, '&') );
		System.out.println( p.leftpad("bit", 2, '&') );
	}

}
