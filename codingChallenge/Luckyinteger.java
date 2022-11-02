package codingChallenge;

import java.util.Arrays;

public class Luckyinteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,4,4,4,4,3,3,3};
		Arrays.sort(arr);
		Luckyinteger lint=new Luckyinteger();
		int findluckyint = lint.findluckyint(arr);
		System.out.println("Lucky Integer is "+ findluckyint);
	}

	public int findluckyint(int [] input) {
		int output=-1;
		
		for(int i=0;i<input.length-1;i++) {
			int count=1;
			for(int j=i+1;j<input.length;j++) {
				if (input[i]==input[j]) {
					count=count+1;
				
				}
				else {
					break;
				}
			}
			if (count==input[i]) {
				output=input[i];
			}
			i=i+(count-1);
			
				
		}
		
		return output;
	}
	
}
