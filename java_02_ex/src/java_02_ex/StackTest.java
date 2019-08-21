package java_02_ex;

public class StackTest {

	public static void main(String[] args) {

		MyStack2 stack = new MyStack2(10);
		if (stack.isEmpty()) {
			System.out.println("스택이 비어있습니다.");
		}

		for (int i = 1; i <= 10; i++) {
			stack.push(i);
		}

		if (stack.isFull()) {
			System.out.println("스택이 가득 찼습니다.");
		}

		System.out.println("최상위 숫자 : " + stack.top());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("");
		System.out.println("== 스택 리스트 ==");
		for (int i = 1; i <= 10; i++) {
			int num = stack.pop();
			if (num != -1)
				System.out.println(num);
		}
	}

}

class MyStack2 {

	int p;
	int size;
	int[] s;

	public MyStack2() {
		super();
	}

	public MyStack2(int sb) {

		s = new int[sb];
		size = sb;
	}

	public boolean isEmpty() {

		boolean b = false;

		if (p == 0) {
			System.out.println("스택이비어있습니다.");
			b = true;
		}

		return b;

	}

	public boolean isFull() {
		//boolean c = false;

		//if (p == size) {
			//System.out.println("스택이 가득 찼습니다.");
			//c = true;
		//}
		//return c;
		return p == s.length ? true:false;
	}

	public void push(int a) {
		
		if(isFull()) {
			System.out.println("stack is full...");
			return;
		}
		s[p] = a;
		p++;
 
	}

	public int pop() {
		//int n;
		//if (p > 0) {
			//n = s[p--];
			//return n;
		//}
		//return -1;

		if(isEmpty()) return -1;
		return s[p-1];
	}
	
	public int top() {
		if(isEmpty()) return -1;
		return s[--p];
		
	}

}
