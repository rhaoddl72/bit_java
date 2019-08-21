package java_prob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class BookMgr {

	List<Book> list = null;
	//배열 메모리 정해짐 리스트는 메모리가 정해져있지않고 계속 늘릴 수 있음

	public BookMgr() {

		list = new LinkedList<Book>();
		           //인덱스가없음
		// list = new ArrayList<Book>();

	}

	public BookMgr(List<Book> list) {
		super();
		this.list = list;
	}

	public boolean addbook(Book book) {
		return list.add(book);
	}

	public void deleteBook(String title) {
		Iterator<Book> it = list.iterator();
		while (it.hasNext()) {
			Book data = it.next();
			if (data.getTitle().equals(title)) {
				System.out.println(data + "-> 삭제됩니다.");
				it.remove();

			}

		}
		System.out.println(title + "도서가 없습니다.");
	}

	public List<Book> searchTitleBook(String title) {
		Iterator<Book> it = list.iterator();
		//list랑 map에서 기능 구현할떄
		List<Book> slist = new ArrayList<Book>();
		while (it.hasNext()) {
			Book data = it.next(); 
			if (data.getTitle().toUpperCase().contains(title.toUpperCase())) {
				                //소문자대문자상관없이 대문자로 출력               //contains true false 반환
				slist.add(data);
			}
				
		}
		return slist;
	}

	public List<Book> booklist() {
		System.out.println("=======booklist========");
		return list;

	}
}
