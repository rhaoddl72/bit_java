package day10;

public class Animal {
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
   public void breath() {
	   System.out.println(kind+" : 폐로 숨쉬기~~~~~~~");
	   
   }
   public void print() {
	   System.out.printf("Animal : %s",kind);
   }
   
}
