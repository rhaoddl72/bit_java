package day17;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;


public class Test03 {

	public static void main(String[] args) {
		List list = new Vector();  // Object[]
		list.add("hello");
		list.add("java");
		list.add(200);
		list.add(new Date());
		list.add(new Book("spring",50000));
		
		System.out.println(list);
		
		for(int i =0; i < list.size(); i++) {
		System.out.println(list.get(1)); // Object 다운캐스팅필요

		}
	}

}
