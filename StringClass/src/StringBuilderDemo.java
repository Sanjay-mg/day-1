
public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("IBM"); // cannot use "ibm" directly
		sb.append(",Bangalore");
		System.out.println(sb);
		System.out.println(sb.charAt(2));
		System.out.println(sb.indexOf("B")); // first occurance
		System.out.println(sb.lastIndexOf("B")); // last occurance
		
		String str = new String("IBM,Bangalore");
		System.out.println(str == sb.toString());
	}
}
