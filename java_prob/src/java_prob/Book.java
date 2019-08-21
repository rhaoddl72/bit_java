package java_prob;

public class Book extends Object implements Comparable<Book> {
	                                         //비교의 기준

	
	
	private int isbn;
	private String title;
	private int price;
	

	
	public Book(int isbn, String title, int price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.price = price;
	}

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
	
	
@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}





public void print() {
	System.out.printf("Book[%s: %7d] %n",title,price);
}

@Override
public int compareTo(Book i) {
	return title.compareTo(i.title);
}
		

	}


