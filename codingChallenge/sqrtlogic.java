package codingChallenge;

public class sqrtlogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sqrtlogic sq = new sqrtlogic();
		int output = sq.sqrt(21);
		System.out.println("Square Root of given no is: " + output);

	}

	public int sqrt(int input) {
		// TODO Auto-generated method stub

		double number = input;
		double wholenum = 0;
		double rem = 0;
		double quot = 0;
		double sqrt = 0;
		double divisor = 0;
// Finding whole number sqrt
		for (int i = 1; i <= (int) input; i++) {

			if ((i * i) > input) {
				wholenum = i - 1;
				divisor = wholenum;
				quot = divisor;
				rem = input - (wholenum * wholenum);				
				sqrt = wholenum;
				break;
			}

		}

//Step2
		double root = 0.1;
		if (rem > 0) {

			input = (int) (rem * 100);
			divisor = sqrt * 2 * 10;
			

			int k;
			for (k = 1; k <= 9; k++) {

				divisor = divisor + 1;

				rem = input - (divisor * k);
				if (rem < divisor) {

					break;
				}

			}

		

			rem = input - (int) (divisor * k);
			quot = input / divisor;
			sqrt = sqrt + (quot * root);
			root = root * 0.01;

		}

	System.out.println(sqrt);
		return (int) Math.round(sqrt);
	}

}
