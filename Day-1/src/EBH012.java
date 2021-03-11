
public class EBH012 {
	static boolean m1(String s,boolean b) {
		if(b==true)
			System.out.print(s+(b?"T":"F"));
		return b;
	}
	public static void main(String[] args) {
//		printPattern();
		m1("San",true);
//		m1("A",m1("B",false));

	}
}
