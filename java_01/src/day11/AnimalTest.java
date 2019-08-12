package day11;

import day10.Animal;
import day10.Dog;

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal d = new Dog("진돗개","쫑이");
		if(d instanceof Dog) ((Dog)d).dogprint();
		
		Dog dd = (Dog) d;
		if(d instanceof Fish) {
			
			Fish ff = (Fish) d;
		}
		d.breath();
		
		
		Animal f = new Fish("구피");
		//Fish f = new Fish("구피");
		if(f instanceof Fish) ((Fish)f).fishprint();//캐스팅 필요
		f.breath();
		((Fish)f).breath(); //오버라이딩 자원 캐스팅 필요ㄴㄴ

	}

}
