
public class StaticKeyword {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		System.out.println(s1.getCount());
		s2.setCount(1);
		System.out.println(s2.getCount());
		Student.study();
	}
}

class Student{
	private static int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	public static void study() {
		System.out.println("study..");
	}
	
}