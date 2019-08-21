package day_01_ex;

public class Prob12 {

	public static void main(String[] args) {
	Prob12 prob1 = new Prob12();

		System.out.println( prob1.leftPad("bit", 6, '#') );
		System.out.println( prob1.leftPad("bit", 5, '$') ); 
		System.out.println( prob1.leftPad("bit", 2, '&') ); 
	}
	public String leftPad(String str, int size, char padChar) {

		String str1 = str;
		
		for(int i=0; i<str1.length(); i++) {
			str = padChar+str; 
			
		}
		
		return str;
	}
	}


