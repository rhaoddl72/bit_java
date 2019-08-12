package day14;

public interface Command {
	public void exec();
	default void check() {
		System.out.println("Command chek() 함수");
	}
	//인터페이스에서 바디부가 있는 부분은 반드시 default메소드 사용
	//인터페이스 안에는 추상메소드 외에 default메소드를 추가할수있음 abstract도 아니고 instance메소드도아님 static처럼 작동
		
	}

class DeleteCommand implements Command{

	@Override
	public void exec() {

		System.out.println("Delete 수행");
	}
	public void check() {
		System.out.println("Command chek() 함수");
	}
	
}


class InsertCommand implements Command{

	@Override
	public void exec() {

		System.out.println("Insert 수행");
	}
	
}	
	class UpdateCommand implements Command{

		@Override
		public void exec() {

			System.out.println("update 수행");
		}
}
	
	
	
	
	
	class ListCommand implements Command{

		@Override
		public void exec() {

			System.out.println("List 수행");
		}
}
