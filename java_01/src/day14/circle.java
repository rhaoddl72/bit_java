package day14;

abstract class Shape implements Drawandmore{
	                   //shape에 drawandmore 구현
	abstract double area();
	
	
	  //public void print() {
		   //S/ystem.out.printf("Animal");
	  // }

}


interface Drawable{
	//
	abstract void draw();
	 
	   }
	 //구현은 불가능 선언만 가능
		
	//public abstract 생략됨
//자바 뒤에는 인터페이스 붙이면 abstract 자동으로 생성됨
 //

interface Moveable{
	 void move(int n);
	 //abstract메소드로 인식해서 바디필요없음
	 //abstract클래스는 abstract마킹 해줘야함
	
}



interface Drawandmore extends Drawable,Moveable {}
                         //다중상속 , interface만가능








public class circle extends Shape implements  Drawable,Moveable,Cloneable{
	                //상속의의미                                    //인터페이스문은 뒤에 추가로입력해주면됨         
	//implements 구현의의미 뒤에는 인터페이스 
	public Point p;
	
	
	public int r;
	
	

	
	
	
	
	
	
	
	
	
	
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
		System.out.println("사각형그리기");
		
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
	public void move(int n) {
		//p.x = p.x+n;
		p.setX(p.getX()+n);
		p.setY(p.getY()+n);
	}
	
	public String toString() {
		return "circle [p="+p+",r="+r+"]";
	}
	
	
	@Override
			public circle clone() throws CloneNotSupportedException {
			circle c = (circle)super.clone();
			Point p = c.p.clone();
			c.p = p;
			return c;
			}
	
	
	
	

	
	 
	
}
