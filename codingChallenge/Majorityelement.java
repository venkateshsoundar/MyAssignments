package codingChallenge;

import java.util.Arrays;

public class Majorityelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
		Arrays.sort(nums);
		int numberbytwo = nums.length / 2;

		int count;

		for (int i = 0; i < nums.length; i++) {
			count = 1;
			for (int j = i + 1; j < nums.length; j++) {

				if (nums[i] == nums[j]) {
					count = count + 1;
				} else {
					break;
				}

			}

			if (count > numberbytwo) {
				System.out.println("Majorityelement: " + nums[i]);
				break;
			}

		}

	}

}
