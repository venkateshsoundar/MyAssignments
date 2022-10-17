package week3.Day2assignments;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)	
		
		String[] input= {"HCL", "Wipro",  "Aspire Systems", "CTS"};

		// get the length of the array	
		
		int len= input.length;		

		// sort the array		
		List<String> list = Arrays.asList(input);	
		Collections.sort(list);
	

		// Iterate it in the reverse order
		
		for (int i = list.size() - 1; i >= 0 ; i--) {
            System.out.println(list.get(i));
        }
		
		// print the array
			
		// Required Output: Wipro, HCL , CTS, Aspire Systems
		
	}

}
