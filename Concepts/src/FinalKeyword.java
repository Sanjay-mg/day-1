
public class FinalKeyword {
	public static void main(String[] args) {
		Child child = new Child();
		child.m1();
	}
}

// class, method and variables can be final
class Parent{
	final String name = "Sanjay";
	final void m1() {
		System.out.println("parent");
	}
	void m2() {
		System.out.println("parent");
	}
}

class Child extends Parent{
	@Override //mark the annotation for best practice
	void m2() { // override
		System.out.println("child");
	}
	
}