package day08;

public class p164_test {

	public static void main(String[] args) {
		count c1 = new count();
		System.out.println(count.count);
		count c2 = new count();
		count c3 = new count();
		count c4 = new count();
	}

}

  class count{
	int c;
	static int count;
	public count() {
		c++;
		count++;
	}
}
