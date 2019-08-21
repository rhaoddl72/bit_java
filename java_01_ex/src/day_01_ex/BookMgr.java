package day_01_ex;

public class BookMgr {

	private Book[] booklist;
 	//Book booklist[] = new Book[5];
	int count = 0;
	public BookMgr() {
		this(10);
		//Booklist  = new Book[10];
	}
	public BookMgr(int size) {
		booklist = new Book[size];
	}
	
	public Book[] getBooklist() {
		return booklist;
	}
	public void setBooklist(Book[] booklist) {
		this.booklist = booklist;
	}
	public void addBook(Book book) {
	    if(count == booklist.length) {
	    	Book[] copy = new Book[booklist.length*2];
	    	
	    	System.arraycopy(booklist, 0, copy, 0, booklist.length );
	    	booklist = copy;
	    	
	    }
		
		
	
booklist[count] = book;
	count++;
	}
	public void booklistprint() {
		for(int i=0; i<count; i++) {
			booklist[i].print();
		}
	}
	public int bookTotalpric() {
		int sum = 0;
		for(int i=0; i<count; i++) {
			sum += booklist[i].getPrice();
		}
		return sum;
	}
}

