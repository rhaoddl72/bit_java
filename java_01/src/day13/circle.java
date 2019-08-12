package day13;

abstract class Shape{
	abstract double area(); 
	
	  public void print() {
		   System.out.printf("Animal");
	   }

}

interface Drawable{
	//
	abstract void draw();
	 
	   }
	 //구현은 불가능 선언만 가능
		
	//public abstract 생략됨
//자바 뒤에는 인터페이스 붙이면 abstract 자동으로 생성됨
 //










public class circle extends Shape implements Drawable{
	                //상속의의미            //implements 구현의의미 뒤에는 인터페이스 선언문이옴
	Point p;
	int r;

	
	
	
	
	
	
	
	
	
	
	public circle() {
		super();
	}


	public circle(Point p, int r) {
		super();
		this.p = p;
		this.r = r;
	}


	@Override
	public double area() {
		return r*r*Math.PI;
	} //부모의 접근 지정자는 자식보다 커야한다.

	
	@Override
	public void draw() {
		System.out.println("김은혜");
		
	}


	public Point getP() {
		return p;
	}


	public void setP(Point p) {
		this.p = p;
	}


	public int getR() {
		return r;
	}


	public void setR(int r) {
		this.r = r;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((p == null) ? 0 : p.hashCode());
		result = prime * result + r;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		circle other = (circle) obj;
		if (p == null) {
			if (other.p != null)
				return false;
		} else if (!p.equals(other.p))
			return false;
		if (r != other.r)
			return false;
		return true;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

	
	 
	
}
