package fizzbuzzkata;

public class fizzBuzzKata {

	public int[] getNumbers() {
		int[] numbers = new int[100];
		for (int tick = 0; tick < numbers.length; tick++) {
			numbers[tick] = tick + 1;
		}
		return numbers;
	}
	
	public String fizzbuzzkata(int value) {
		if (value % 3 == 0 || value % 5 == 0) {
			if (value % 3 == 0 && value % 5 == 0) {
				return "fizzbuzz";
			} else if (value % 3 == 0) {
				return "fizz";
			} else if (value % 5 == 0) {
				return "buzz";
			}
		} else {
			return Integer.toString(value);
		}
		return "";
	}
} 
