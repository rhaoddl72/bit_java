package day15;

public interface Command {

	void exac();
	default public void check() {
		System.out.println("check ~~~~");
	}
}


class DeleteCommand implements Command{

	@Override
	public void exac() {
		System.out.println("DeleteCommand 수행");
		
	}
	
}

class UpdateCommand implements Command{

	@Override
	public void exac() {
		System.out.println("UpdateCommand 수행");
	}
	
}
