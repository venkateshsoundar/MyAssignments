package week1.Day1;

public class Factorial {
	/*
	 * Goal: Find the Factorial of a given number
	 * 
	 * input: 5 output: 5*4*3*2*1 = 120
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter
	 * 
	 * What are my learnings from this code? 1) 2) 3)
	 * 
	 */

	public static void main(String[] args) {
		// Declare your input as 5
		int input = 5;
		int fact = 1;

		for (int j = 1; j <= input; j++) {
			fact = fact * j;

		}

		System.out.println("The factorial of " + input + " is " + fact);

	}

}
