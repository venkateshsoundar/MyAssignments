package codingChallenge;

import java.util.Arrays;
import java.util.Iterator;

public class Distinctarray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
		Distinctarray da = new Distinctarray();
		System.out.println(da.arrdistinct(nums));
	}

	public boolean arrdistinct(int input[]) {
		Boolean output = false;
		int distinctcount = 0;
		Arrays.sort(input);
		for (int i = 0; i < input.length; i++) {
			int tempcounter = 1;
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] == input[j]) {
					tempcounter = tempcounter + 1;
					i = i + 1;
				}
			}
			if (tempcounter > 1) {
				distinctcount = distinctcount + 1;
			}
		}
		if (distinctcount > 0) {
			output = true;
		}
		return output;
	}
}
