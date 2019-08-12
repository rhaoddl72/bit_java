package day24;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

//Book 만든 후 북매니저를 콜렉션 기반으로 바꾸어서 curd가 되도록 만든다

public class BookMgr {
	String fileName;
	List<Book> list = new ArrayList<Book>();

	BookMgr() {
		fileName = "book.dat";
		Thread t1 = new AutoSave();
		t1.start();
	}

	public boolean addBookList(Book bookList) {

		return list.add(bookList);

	}

	public boolean deleteBookList(String bookname) {

		Iterator<Book> it = list.iterator();
		while (it.hasNext()) {
			Book b = it.next();

			if (b.getTitle().equals(bookname)) {
				it.remove();
				System.out.println("삭제되었습니다.");
				return true;
			}
		}
		return false;

//		it = list.iterator();
//		while(it.hasNext()) {
//			Book data =it.next();
//			if(data.getTitle().equals(bookname)) {
//				System.out.println(data+"=>삭제됩니다.");
//				it.remove();
//			}
//		}

	}

	public List<Book> selectBookList(String bookname) {
		Iterator<Book> it = list.iterator();
		List<Book> slist = new ArrayList<Book>();
		while (it.hasNext()) {
			Book b = it.next();
			String data = b.getTitle();
			if (data.toUpperCase().contains(bookname.toUpperCase())) {
				slist.add(b);
			}

		}
//		
//		while(it.hasNext()) {
//			Book data = it.next();
//			if(data.getTitle().toUpperCase().contains(bookname.toUpperCase())) {
//				System.out.println(data);
//			}
//		}
		return slist;
	}

	public List<Book> bookList() {
		System.out.println("=========Book List ==========");
		return list;

	}

	public void save() {
		MyFile.save(fileName, list);
	}

	class AutoSave extends Thread {
		@Override
		public void run() {
			while (true) {
				save();
				System.out.println("AutoSave()");
				try {
					Thread.sleep(1000 * 60 * 2);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	public List<Book> load(String fileName) {

		return list = (List<Book>) MyFile.load(fileName);
	}

	public int maxIsbn() {
		int max = 0;
		Iterator<Book> it = list.iterator();
		while (it.hasNext()) {
			Book data = it.next();
			if (data.getIsbn() > max) {
				max = data.getIsbn();
			}
		}
		return max;
	}

}
