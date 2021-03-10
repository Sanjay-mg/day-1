package dataConversation;
class Student extends Human{
	public Student(String name) {
		this.name = name;
	}

	private String name;
	public void eat() {
		super.eat(); // access human class eat method
		System.out.println("student eats");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}