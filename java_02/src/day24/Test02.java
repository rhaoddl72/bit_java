package day24;

public class Test02 {
	public static void main(String[] args) {
		System.out.println("main start");
		
		MyStack stack = new MyStack();
		Push job1 = new Push(stack);
		pop job2 = new pop(stack);
		
		
		Thread push = new Thread(job1,"Push");
		Thread pop = new Thread(job2,"pop");
		
		push.start();
		pop.start();
		
		System.out.println("main end");
	}

}

class Push implements Runnable{
	MyStack stack;
	
	

	public Push() {
		super();
	}
	
	



	public Push(MyStack stack) {
		super();
		this.stack = stack;
	}


	public void run() {
		for(int i = 0; i<10; i++) {
			stack.push(i);
			
			
			try {
				Thread.sleep((int)(Math.random()*100));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}



	
}


class pop implements Runnable{
	MyStack stack;
	
	

	public pop() {

	}
	
	



	public pop(MyStack stack) {
		super();
		this.stack = stack;
	}





	@Override
	public void run() {
		for(int i = 0; i<10; i++) {
			stack.push(i);
			
			
			try {
				Thread.sleep((int)(Math.random()*100));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
