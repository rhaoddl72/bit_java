package day17;

public class Test02 {
	public static void main(String[] args) {
		Book b1 = new Book("java", 700); //생략하면<object,objcet>
		System.out.println(((String)(b1.getTitle())).charAt(0));
		
		if(b1.getTitle() instanceof String)
			System.out.println(((String)(b1.getTitle())).charAt(0));
			
		
		
		Book<String,Integer> b2 = new Book<String,Integer>("sql",400); 
		System.out.println(b2.getTitle().charAt(0));
		
		Book<?,Integer> b3 = new Book<String,Integer>("spring",400); 
		System.out.println(b3.getTitle());
		
		Book<String,? extends Number> b4 = new Book<String,Integer>("spring",400); 
                           //extends 자식		
		System.out.println(b4.getPrice()); // 뒤에 물음표 Number type
		Book<String,? super Number> b5 = new Book<String, Object>("spring",400); 
		//super 부모
		System.out.println(b5.getPrice()); // ? => Object
	} 
	

}
