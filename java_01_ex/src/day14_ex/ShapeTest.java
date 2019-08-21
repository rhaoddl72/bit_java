package day14_ex;

public class ShapeTest {

	public static void main(String[] args) {
		

	  Rectangle a = new Rectangle(5, 6);
	 RectTriangle b = new RectTriangle(6,2);
	 Shape1[] c = {a,b};
	 
	 for(Shape1 data : c) {
		System.out.println("area :" + data.getArea());
		if(data instanceof Resizable) {
			
			((Resizable)data).resize(0.5);
			System.out.println("New area :" + data.getArea());
		}
		
		
	 }
	 
	
	 
		
		

	}

}
