package dataConversation;

public class DataDemo {
	public static void main(String[] args) {
		int a = 30; // 4 byte
		long long1 = a; // 8 byte
		System.out.println(long1);
		byte byte1 = (byte) a; // 1 byte , dangerous, narrowing, downcasting
		System.out.println(byte1);
		
		double d1 = 35.0;
//		float f1 = d1; //avoid this
	}
}
