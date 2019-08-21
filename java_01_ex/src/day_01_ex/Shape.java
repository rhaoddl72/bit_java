package day_01_ex;

public abstract class Shape {
	
	private String name;
	protected double area;
	
	
	
	
	
	public Shape() {
		this("~~~~"); //this 때문에 super생략
	}
	public Shape(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void calculationArea();
	public void print() {
		System.out.println(name+"의 문장은"+ area);
		
	}

}
