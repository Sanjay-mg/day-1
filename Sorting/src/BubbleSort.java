
public class BubbleSort {
	public static void main(String[] args) {
		int[] numbers = {8,22,7,9,31,5,13};
		int n = numbers.length, counter = 0;;
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-i-1; j++) {
				if(numbers[j]>numbers[j+1]) {
					counter++;
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("total count: "+counter);
	}
}
