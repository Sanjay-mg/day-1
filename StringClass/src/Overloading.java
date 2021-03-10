
public class Overloading {
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		s1.study();
		s1.study(5);
		s1.study(3,"java");
	}
}

// method overloading : same method name but different number and types of argument, access could be anything
class Student1{
	public static void study() {
		System.out.println("study..");
	}
	public static void study(int duration) {
		System.out.println("study for "+ duration + " hour");
	}
	public static void study(int duration, String subject) {
		System.out.println("study "+ subject + " for "+ duration + " hour");
	}
}