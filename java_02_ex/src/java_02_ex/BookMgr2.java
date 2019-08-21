package java_02_ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.BiConsumer;

public class BookMgr2 {
	
	Map<Integer,Book> map = null;
	

	public BookMgr2() {
		map = new HashMap<Integer,Book>();
	}

	
	
	
	public void addbook(Book bookList) {
		map.get(bookList);
		}
	
	
	
	public void deletBook(String title) {
		//System.out.println("=======book list=====");
		Iterator<Integer> it = map.keySet().iterator();
		while (it.hasNext()) {
			Integer isbn= it.next();
			Book data = map.get(isbn);
			if(data.getTitle().equals(title)) {
				System.out.println(data+"삭제됩니다.");
				it.remove();			}
		}
		
		System.out.println(title+"도서가 없습니다.");
		
		
	}
	public void searchTitleBook(String title) {
		System.out.println(title+"검색");
		Iterator<Integer> it = map.keySet().iterator();
		while (it.hasNext()) {
			Integer isbn = it.next();
			Book data = map.get(isbn);
			if(data.getTitle().toUpperCase().contains(title.toUpperCase()));
			System.out.println("검색되었습니다." + data);
			}
		}
	
	
	
	
	
	public void booklistprint() {
		System.out.println("=======booklist foreach========");
		
		map.forEach((k, v) -> System.out.println(k + " : "+ v));

			
				
			
		
		System.out.println("=================");
	
}
}
