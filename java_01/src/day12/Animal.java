package day12;

public abstract class Animal {
	//abstract 상속을 전제로 만든 클래스
   protected String kind = "동물의 종류";
   
   
   
   
   
   
   public Animal() {
	super();
	
	
}
public Animal(String kind) {
	super();
	this.kind = kind;
}
public String getkind() {
	   return kind;
   }
   public void setkind(String kind) {
	   this.kind = kind;
   }
   public abstract void breath() ; //추상 메소드
   
   public void print() {
	   System.out.printf("Animal : %s",kind);
   }
   
}
