import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.ibm.Book;

public class ListDemo {
	public static void main(String[] args) {
//		demo1();
		booklist();
	}

	private static void booklist() {
		List<Book> books = new ArrayList<Book>();
		Book book1 = new Book("learn java");
		book1.setPrice(100.0f);
		book1.setPublishYear(2008);
		books.add(book1);
		
		Book book2 = new Book("learn javascript");
		book2.setPrice(150.0f);
		book2.setPublishYear(2006);
		books.add(book2);
		
		Book book3 = new Book("learn python");
		book3.setPrice(200.0f);
		book3.setPublishYear(2007);
		books.add(book3);
		
		System.out.println(books);
		books.sort(new Comparator<Book>() {

			@Override
			public int compare(Book book1, Book book2) {
				return book1.getPublishYear() - book2.getPublishYear();
			}
		});
		System.out.println("After sorting: "+books);
		
//		Iterator<Book> it = books.iterator();
//		while (it .hasNext()) {
//			Book book = it.next();
//			if(book.getTitle().contains("learn")) {
//				System.out.println(book);
//				System.out.println(book.getPrice());
//				}
//		}
	}

	private static void demo1() {
		List<Integer> list = new ArrayList<Integer>(); //Generics
		list.add(1);
		list.add(3);
		list.add(5);
//		list.add("ram");
		System.out.println(list.indexOf(3));
		System.out.println("Before: "+list);
//		list.remove(1);
		System.out.println(list.contains(3));
		System.out.println("After: "+list);
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
	}
}
