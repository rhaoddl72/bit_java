package java_02_ex;

public class DiceGame {

	public static void main(String[] args) {

		DiceGame game = new DiceGame();
        
		int result1 = 0;
		try {
			 result1 = game.countSameEye(10);
			System.out.println("면의 개수가 8개인 주사위 2개를 던져서 같은 눈이 나온 횟수: " + result1);
		} catch (Exception e) {

			e.printStackTrace();
		}
        int result2 = 0; //변수 초기화 작업
		try {
			 result2 = game.countSameEye(-10);
			System.out.println("면의 개수가 8개인 주사위 2개를 던져서 같은 눈이 나온 횟수: " + result2);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	int countSameEye(int n) throws Exception {
		if (n < 0) {
			throw new Exception("음수 발생 no");
		}

		int count = 0;

		Dice d1 = new Dice(8);
		Dice d2 = new Dice(8);

		//for (int i = 0; i < n; i++) {
			//if (d1.play() == d2.play())
				//count++;
		//}
		while(n > 0) {
			if(d1.play() == d2.play()) count++;
			n--;
		}
		return count;
	}
}
