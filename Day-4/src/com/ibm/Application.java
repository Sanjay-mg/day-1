package com.ibm;

class Book{
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) throws MyException {
		if(title == null) {
			throw new MyException("title is null");
			}
		this.title = title;
	}
	@Override
	public String toString() {
		return this.title;
	}
}
public class Application {
	public static void main(String[] args) {
		Book book1 = new Book();
		try {
			book1.setTitle("Ram");
		}catch (IllegalArgumentException illegalArgumentException) { // higher priority exception should be on top
			
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("always executes");
		}
		System.out.println(book1.toString());
//		Book book2 = new Book();
//		book2.setTitle("learning javascript");
//		System.out.println(book2);
	}
}
