package day14.tv;

public class Tvtest {

	public static void main(String[] args) {

		//TV user = new STV();
		// 로컬 강하게엮임
		play(new STV());
		
		play(new LTV());
		
		new ITV();
		
		
		
		
		
		//user.poweron();
		//user.poweroff();
		
		//user = new LTV();
		//user.poweron();
		//user.poweroff();
		//연관된 기능 들어감 
		
		//user = new ITV();
	    //user.poweroff();
	   //user.poweron();
}

	//public static void play(STV tv) {
		//tv.poweron();
		//tv.poweroff();
	//}
	
	public static void play(TV tv) {
		tv.poweron();
		tv.poweroff();
	}



}

