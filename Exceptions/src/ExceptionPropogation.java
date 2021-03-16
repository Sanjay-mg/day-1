
public class ExceptionPropogation {
	public static void main(String[] args) {
		new A().m1();
//		System.out.println("in main");
	}
}

class A{
	void m1() {
		try { // handling exception in m2
			m2();			
		}catch(RuntimeException runtimeException) {
			runtimeException.printStackTrace();
			System.out.println("Caught Runtime Exception");
		}catch(Exception exception) {
			System.out.println("Caught Exception");
		}
		finally {
			System.out.println("Always executed");
		}
		System.out.println("m1");
	}
	
	void m2() throws Exception{
		System.out.println("m2");
		throw new Exception();
//		throw new RuntimeException();
	}
}