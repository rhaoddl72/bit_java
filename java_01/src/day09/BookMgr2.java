package day09;

public class BookMgr2 {

	private Book[] booklist;
 	//Book booklist[] = new Book[5];
	int count = 0;
	public BookMgr2() {
		this(10);
		//Booklist  = new Book[10];
	}
	public BookMgr2(int size) {
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
	public void deletBook(String title) {
		//System.out.println("=======book list=====");
		for(int i=0; i<count; i++) {
			if(booklist[i].getTitle().equals(title)) {
				System.arraycopy(booklist, i+1, booklist, i,count-i-1 );
				count--;
				System.out.println(title + "삭제되었습니다.");
				return;
			}
			//booklist[i].print();
		}
		System.out.println(title+"도서가 없습니다.");
		
		
	}
	public void searchTitleBook(String title) {
		System.out.println(title+"검색");
		for(Book data:booklist) {
			
			if(data !=null &&data.getTitle().toUpperCase().contains(title.toUpperCase())) {
				data.print();
			}
		}
	}
	
	
	
	
	public void booklistprint() {
		System.out.println("=======booklist========");
		for(int i =0; i<count; i++) {
			booklist[i].print();
		}
		System.out.println("총"+count+"권");
	}
}

