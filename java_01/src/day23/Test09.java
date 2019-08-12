package day23;

public class Test09 {

	public static void main(String[] args) {
		System.out.println(Thread.MAX_PRIORITY); // 10
		System.out.println(Thread.MIN_PRIORITY); // 1
		System.out.println(Thread.NORM_PRIORITY); // 5 우선순위
	    //가비지컬렉터 운선순위1 동작은 바로하지 않고 HEAP영역이 60%정도 찼을때 우선순위가 최우선으로바뀜	
 
		System.out.println("Main Start");
		System.out.println(Thread.currentThread());
		
		T1 t1 = new T1();
		
		T2 t2 = new T2();
		
		
		
		
		t1.start();
		t2.start();
		
		System.out.println("홀수합 + 짝수합 =" + (t1.sum+t2.sum));
		System.out.println("Main end");
		

	}

}

class T1 extends Thread{
	         //runnable 인터페이스를 구현시켜줌 그래야 스레드작동
	int sum = 0; //홀수합 계산할 변수
	public void run()
	//runnable 추상메소드
	{
		for(int i =1; i<100; i+=2) {
			sum += i;
			System.out.print(Thread.currentThread()+"  ");
			System.out.println("1~"+i+" 홀수합 :"+sum);
		}
		
	}}
		class T2 extends Thread{
			int sum = 0; //홀수합 계산할 변수
			public void run() {
				for(int i =0; i<100; i=i+2) {
					sum += i;
					System.out.print(Thread.currentThread()+"  ");
					System.out.println("0~"+i+" 짝수합 :"+sum);
				}
		
		
	}

		}



