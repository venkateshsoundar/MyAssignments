package codingChallenge;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 19;
		int result = 0;
		System.out.println("Input: "+ n);

		while (result != 1 && result != 4) {
			result = HappyNumber.squaredigit(n);			
			n=result;
		}

		if (result == 1) {
			System.out.println("Given number is Happy Number");
		} else if (result == 4)
			System.out.println("Given number is Not Happy Number");

	}

	public static int squaredigit(int num) {

		int sum = 0;
		int rem=0;
		while (num > 0) {
			rem = num % 10;
			sum = sum + (rem * rem);
			num = num / 10;
		}

		return sum;
	}

}
