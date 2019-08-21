package java_02_ex;

public class MyStack<E> {

	E[] s;
	int p = 0;
	
	MyStack(){
		s = (E[]) new Object[10];
		
	}
	MyStack(int size) {
		if(size < 0)
			s = (E[]) new Object[10];
		else
			s = (E[]) new Object[size];
			
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
