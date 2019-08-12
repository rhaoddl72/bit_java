package day06;

public class Animal {
	private int age;
	private String name;
	private boolean live;
	
	public void display() {
		System.out.printf("[나이:%10s,이름:%10s,생존여부:%10s]%n",this.age,this.name,this.live);
		return;}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isLive() {
		return live;
	}

	public void setLive(boolean live) {
		this.live = live;
	}
	public void print() {
		System.out.println(name+":"+age+":"+live);
	}
	public static void main(String[] args) {
	
	}
	

	
	

}
