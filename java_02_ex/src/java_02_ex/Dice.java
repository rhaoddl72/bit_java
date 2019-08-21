package java_02_ex;

public class Dice {
	int size;

	public Dice(int size) {
		super();
		this.size = size;
	}
	
	int play() {
		int number = (int) (Math.random()* size) +1;
		return number;
	}
	

}
