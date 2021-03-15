
public class ArrayPresent {
	public static void main(String[] args) {
		int[][] numbers = { { 1,2,3,4} , {5, 6, 7,8 }};;
		for (int[] numberArray : numbers) {
			for (int number : numberArray) {
				System.out.println(number);
			}
		}
	}
}
