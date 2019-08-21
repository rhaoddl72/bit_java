package day_01_ex;

import java.util.Arrays;

public class BookTest {

	public static void main(String[] args) {
		
		BookMgr mgr =  new BookMgr(6);
		
		mgr.addBook(new Book("JAVA",29000));
		mgr.addBook(new Book("HTML",39000));
		mgr.addBook(new Book("JSP",49000));
		mgr.addBook(new Book("DB",79000));
		
		//Book[] a = mgr.getBooklist();
		//for(int i=0; i<a.length; i++) {
			//a[i].print();
		//}
		
		//System.out.println(Arrays.toString(mgr.getBooklist()));
		
		
		
		mgr.booklistprint();
		System.out.println("총합계 :" + mgr.bookTotalpric());
		
		
		
		//Book [] b = new Book[5]; 
		//b[0] = new Book("Java Program", 30000);
		//b[1] = new Book("JSP Program", 36000);
		//b[2] = new Book("SQL Fundam entals", 15000);
		//b[3] = new Book("JDBC program", 33000);
		//b[4] = new Book("EJB Program", 32000);
	//BookMgr bok = new BookMgr(b);
	//bok.printBookList();
	//bok.printTotalPrice();

	}
}


