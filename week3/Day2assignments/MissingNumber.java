
package week3.Day2assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Problem 
		 * 
		 * There will be running number between 1 to 10
		 * One of the unique number will be missing
		 * Find the missing number
		 * 
		 * 
		 */
		
		/*
		 * Psuedocode
		 * 
		 * a) Remove the duplicates using Set
		 * b) Make sure the set is in the ascending order
		 * c) Iterate from the starting number and verify the next number is + 1
		 * d) If did not match, that is the number
		 * 
		 */
		
		
		int[] number= {2,1,3,4,6,7,9,6,8,3};
		int count=1;
	
		List<Integer> lst=new ArrayList();
		
		 for (Integer t : number) { 	           
	            lst.add(t); 
	        } 
		
		 Collections.sort(lst);
		 Set<Integer> ste=new LinkedHashSet<Integer>(lst);
		 System.out.println(ste);
		
		 for (Integer u : ste) { 
			
	          if(count!=u) {	
	        	 
	        	 System.out.println("MissingNumber: "+count);
	        	 break;
	          }
	          else {
	          count=count+1;
	          }
	       
	          
	        } 
		
			
	
		
		
		
		
	}

}
