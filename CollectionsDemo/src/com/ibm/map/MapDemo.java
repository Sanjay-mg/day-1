package com.ibm.map;

import java.util.HashMap;
import java.util.Map;

import com.ibm.Book;

public class MapDemo {
	public static void main(String[] args) {
		createMapofBooks();
	}

	private static void createMapofBooks() {
		Map<String, Book> books = new HashMap<String, Book>();
		System.out.println(books.size());
//		books.put("book1", book1); //Entry = key+value
		for (int i = 1; i < 11; i++) {
			Book book = new Book("Title "+i);
			book.setPrice(100*i);
			book.setPublishYear(i+2000);
			books.put("book"+i, book);
		}
		System.out.println(books);
	}
}
