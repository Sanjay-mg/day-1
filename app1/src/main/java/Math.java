
public class Math {
	public int add(int... numbers) {
		int result = 0;
		int counter = 0;
		while(counter < numbers.length) {
			result += numbers[counter++];
		}
		return result;
	}
	/**
	 * takes 2 number and multiply them
	 * @author sanjay mg
	 */
	public int multiply(int... numbers){
		int product=1;
		int counter = 0;
		while(counter < numbers.length) {
			int number = numbers[counter++];
			if(number<0) {
				throw new IllegalArgumentException();
			}
			product *= number;
		}
		return product;
	}
}
