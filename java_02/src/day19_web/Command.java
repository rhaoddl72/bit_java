package day19_web;

public interface Command {
	//interface 객체생성불가능 implements구현 람다표현가능 
	void exec();
	default public void print() {
		System.out.println("~~~~~~~~~~~~~");
	}

}


class DeleteCommand implements Command{

	@Override
	public void exec() {

		System.out.println("DeleteCommand   수행");
	}
}
	class UpdateCommand implements Command{

		@Override
		public void exec() {
			
			System.out.println("UpdateCommand 수행");
			
		}
	}
		class InsertCommand implements Command{

			@Override
			public void exec() {
				System.out.println("InsertCommand 수행");
				
			}
		}
		
		class SelectCommand implements Command{

			@Override
			public void exec() {
				
				System.out.println("SelectCommand 수행");
				
			}
		
		}
	
	
	
	
	

