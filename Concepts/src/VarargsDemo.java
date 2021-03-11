
public class VarargsDemo {
	public static void main(String[] args) {
		int result = add("ram",2,3,4,5);
		System.out.println(result);
	}
	static int add(String name, int... numbers) { // varargs
		int sum=0,i=0;
		while(i<numbers.length) {
			sum += numbers[i];
			i++;
		}
		return sum;
	}
}

class Book{
	private String genre;
	private Author[] authors;
	
	public Book() {
		authors = new Author[3];
	}
	class Author{
		private String name;
		private String email;
	}
}