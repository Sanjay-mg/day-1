
public class School {
	public static void main(String[] args) {
		printPattern();
	
	}

	private static void printPattern() {
		int i, j = 0;

		for (i = 0; i < 5; i++) {
			j = 0;
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
		}
	}

	void teacherDiscussion() {
		int i, j = 0, k = 0;
		for (i = 0; i < 10; i++) {
			Teacher teacher = new Teacher("Sanjay" + i);
		}
		while (j < 10) {
			Teacher teacher = new Teacher("Sanjay" + j);
			j++;
		}
		do {
			Teacher teacher = new Teacher("Sanjay" + k);
			k++;
		} while (k < 10);
	}

	void studentDiscussion() {
		System.out.println("Hello");
		Student student = new Student("Sanju");
		// student.name = "ram";
		student.setAge((byte) 24);
		System.out.println("Name is: " + student.getName());
		System.out.println("Age is: " + student.getAge());
		student.study();
	}
}
