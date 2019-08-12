package day08;

public class BlockTest {

	public static void main(String[] args) {
	Block b1 = new Block();	
	Block b2 = new Block();	
	Block b3 = new Block();	
	Block b4 = new Block();
	
	Block aa1 = new Block(5);
	b1.print();
	b2.print();
	b3.print();
	b4.print();
	aa1.print();
	}
	

}

class Block{
	int i;
	int j;
	static String name;
	static{
		name = "~~~~~~";
		//System.out.println("static {  }");
	} //딱학번 수행
 {
		//System.out.println("{  }");
	} // 매번 수행
	public Block() {
		//System.out.println("생성자"); //생성자함수
		this.j = 99; // 다른생성자랑 같이 호출
		
	}
	public Block(int i) {
		this.i = i;
	}
	public void print() {
		System.out.printf("i=%s , j=%s, name=%s %n", i, j,name);
	}
	
}
