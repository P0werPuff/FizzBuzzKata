package fizzbuzzkata;

public class fizzBuzzKata {

	public int[] getNumbers() {
		return new int[100];
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
