package java_02_ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class BookMgr {
	

	
	List<Book> list = null;
	
	public BookMgr() {
		
		
		list = new LinkedList<Book>();
		//list = new ArrayList<Book>();
		
		
	}
	public BookMgr(List<Book> list) {
		super();
		this.list = list;
	}
	
		
	

	public void addbook(Book bookList) {
	list.add(bookList);
	}
	
	
	
	
	public void deletBook(String title) {
		Iterator<Book> it = list.iterator();
		while (it.hasNext()) {
			Book data = it.next();
			if(data.getTitle().equals(title)) {
				System.out.println(data + "-> 삭제됩니다.");
				it.remove();
			
		}
		
			}
		System.out.println(title+"도서가 없습니다.");
		}
		
		
	
	public void searchTitleBook(String title) {
		System.out.println(title+"검색");
		Iterator<Book> it = list.iterator();
		while (it.hasNext()) {
			Book data = it.next();
			if(data.getTitle().toUpperCase().contains(title.toUpperCase()));
			System.out.println("검색되었습니다." + data);
		}
			}
		
	
	
	
	
	
	public void booklist() {
		System.out.println("=======booklist========");
		list.forEach(i -> System.out.println(i));
		System.out.println("========================");
	}
}

