package day17;

public class PriceException extends Exception {

	public PriceException() {
		super("음수 허용안됨");
	}
	public PriceException(String msg) {
		super(msg);
	}
}
