package codingChallenge;

import java.util.Arrays;

public class Finduniqueno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums= {1};
		
		
		Arrays.sort(nums);
				int count;
		
		if(nums.length >1 ) {
			
			for(int i=0;i< nums.length;i++) {
				count=0;
				for(int j=i+1;j< nums.length;j++) {
					if(nums[i]==nums[j]) {
						count=count+1;
					  i=i+count;
					  break;
					}		
					
					else {
						System.out.println("The Unique Number is "+ nums[i]);
						break;
						
					}
					
								}
			}
			
		}
		
		else {
			System.out.println("The Unique Number is "+ nums[0]);
		}
		
		
			}
		
	}


