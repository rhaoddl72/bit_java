package day24;

public class MyStack {
	
		int [] stack;
		int stackSize;
		int a;
		
		public MyStack() {
		}
		public MyStack(int size) {
			stack = new int[size];
			stackSize = size;
			if(size<0) {
				stackSize = 10;
			}
		}

		public synchronized void push(int i){
			if(isFull())
				return;
			stack[++a] = i ;
			a++;
			System.out.println("push=>"+ i);
			//wait();
			
		}
		public synchronized boolean isEmpty() {
			return a == -1;
		}
		
		public synchronized boolean isFull() {
			return (a == stackSize-1);
		}
		
		public synchronized int top() {
			if(isEmpty()) {
				return -1;
			}
			return (stack[stackSize-1]);
		
		}
		public synchronized int pop() {
			if(isEmpty())
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			
			int i = stack[--a];
			System.out.println("              pop =>" + i);
			//return stack[a--];
			notifyAll();
			return i;
			
		}
	}


