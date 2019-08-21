package day_01_ex;

public class Book {

	
	
	
	private String title;
	private int price;
	
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}//생성자함수
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		
		this.price = price;
	}
public void print() {
	System.out.printf("Book[%s: %7d] %n",title,price);
}
		

	}


