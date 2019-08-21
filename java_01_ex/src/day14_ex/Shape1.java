package day14_ex;

abstract class Shape1 {
	abstract double getArea();
	int Numside;
	
	
	
	
	public Shape1() {
		super();
	}




	public Shape1(int numside) {
		super();
		Numside = numside;
	} 
	
	

}



class RectTriangle extends Shape1 {

	
	double width;
	double height;
	
	
	
	
	
	
	public RectTriangle() {}


	public RectTriangle(double w, double h) {
		
		width = w;
		height = h;
		
		
	}






	public double getWidth() {
		return width;
	}






	public void setWidth(double width) {
		this.width = width;
	}






	public double getHeight() {
		return height;
	}






	public void setHeight(double height) {
		this.height = height;
	}






	





	@Override
	 double getArea() {
		double area= width*height/2;
		return area;
		
		
	}
	
}



 class Rectangle extends Shape1 implements Resizable {
	
	 double width;
	 double height;
	
	 public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void resize(double s) {
		
		width = width*s;
		height = height*s;
	}
	
	@Override
	double getArea() {
		double area= width*height;
		return area;
	}
	
	
	
	
	 
}



interface Resizable{
	
	void resize(double s);
	
	
	
	
	
}