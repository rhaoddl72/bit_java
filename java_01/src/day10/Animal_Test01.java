package day10;

public class Animal_Test01 {
    public static void main(String[] args) {
    	
    	Animal a1 = new Animal();
    	a1.breath();
    	
    	Animal a2 = new Animal("Dog");
    	a2.breath();
    	
    	Dog d1 = new Dog("시베리안허스키","캐리");
    	d1.breath();
    	d1.dogprint();
    	
    	Dog d2 = new Dog("Dog","진돗개","쫑이");
    	d2.dogprint();
    	
    	String animalkind = d2.getsuperkind();
    	System.out.println(animalkind);
    	
    }
}
