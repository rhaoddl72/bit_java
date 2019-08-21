package day23;

public class Test08 {

	public static void main(String[] args) {
		//System.out.println(Thread.MAX_PRIORITY); // 10
		//System.out.println(Thread.MIN_PRIORITY); // 1
		//System.out.println(Thread.NORM_PRIORITY); // 5 우선순위
	    //가비지컬렉터 운선순위1 동작은 바로하지 않고 HEAP영역이 60%정도 찼을때 우선순위가 최우선으로바뀜	
 
		System.out.println("Main Start");
		
		Thread.yield(); //무시 자리가있으면 양보하고 자리가 없으면 양보하지않고 계속 수행
		System.out.println(Thread.currentThread());
		
		
		
		
		System.out.println(Thread.currentThread()); 
		
		Job1 job1 = new Job1();
		Thread t1 = new Thread(job1,"job1");
		
		Job2 job2 = new Job2();
		Thread t2 = new Thread(job2,"job2");
		
		t1.start();//t1 스레드의 시작
		t2.start();//t2 스레드의 시작
		
		try {
		t1.join();
		t2.join(); //join(yield와 비슷) 다 끝날때까지 아래쪽 프린트 수행이안됨
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("홀수합 + 짝수합 =" + (job1.sum+job2.sum));
		System.out.println("Main end");
		

	}

}

class Job1 implements Runnable{
	         //runnable 인터페이스를 구현시켜줌 그래야 스레드작동
	int sum = 0; //홀수합 계산할 변수
	public void run()
	//runnable 추상메소드
	{
		for(int i =1; i<100; i+=2) {
			sum += i;
			System.out.print(Thread.currentThread()+"  ");
			System.out.println("1~"+i+" 홀수합 :"+sum);
			//try {
				//Thread.sleep(5);
			//}catch(InterruptedException e) {
				//e.printStackTrace();
		//}
		}
		
	}
	}
		class Job2 implements Runnable{
			int sum = 0; //홀수합 계산할 변수
			public void run() {
				for(int i =0; i<100; i=i+2) {
					sum += i;
					System.out.print(Thread.currentThread()+"  ");
					System.out.println("0~"+i+" 짝수합 :"+sum);
					
					//try {
						//Thread.sleep(5);
					//}catch(InterruptedException e) {
						//e.printStackTrace();
					//}
				}
		
		
	}

		}



