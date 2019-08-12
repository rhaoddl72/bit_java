package day12;

public class Fish extends Animal {
	 String kind;
	 String name;
	
	 
	 public Fish(String name) {
		
			this.name=name;
		}
	 
	 public Fish() {
		super("물고기");
	}
	public Fish(String kind, String name) {
		super("물고기");
		this.kind = kind;
		this.name = name;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void breath() {
		System.out.println(super.kind + " => 아가미로 숨쉬기");
		
	}
	
	
	
	
	@Override
	public String toString() {
		return "Fish [kind=" + kind + ", name=" + name + "]";
	}
	
	
	
	

}
