package day14.tv;

interface TV {
	public void poweron();
	public void poweroff();
	

}


class STV implements TV{
	public void poweron() {
		System.out.println("STV poweron");
	}
	public void poweroff() {
		System.out.println("STV poweroff");
	}
}

class LTV implements TV{
	public void poweron() {
		System.out.println("LTV poweron");
	}
	public void poweroff() {
	System.out.println("LTV poweroff");
	
	}
}

class ITV implements TV{

	@Override
	public void poweron() {
		
	}

	@Override
	public void poweroff() {
		
	}
}


