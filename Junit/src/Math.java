
public class Math {
	public int add(int... numbers) {
		int result = 0;
		for (int number : numbers) {
			result += number;
		}
		return result;
	}
}
