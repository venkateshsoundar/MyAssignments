package week3.Day2assignments;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Declare a String as PayPal India
		String input = "PayPal India";

//			Convert it into a character array
		char[] charray = input.toCharArray();

//			Declare a Set as charSet for Character

		Set<Character> charSet = new HashSet<Character>();

//			Declare a Set as dupCharSet for duplicate Character

		Set<Character> dupCharSet = new HashSet<Character>();

//			Iterate character array and add it into charSet
		
//		if the character is already in the charSet then, add it to the dupCharSet

//		Check the dupCharSet elements and remove those in the charSet

//		Iterate using charSet

//		Check the iterator variable isn't equals to an empty space

//		print it
		
		System.out.println(charray.length);

		for (int i = 0; i < charray.length; i++) {	
			
			if(charSet.contains(charray[i])) {
				dupCharSet.add(charray[i]);
				
			}
			else {
			charSet.add(charray[i]);					
			}
		
		charSet.remove(' ');

		}
		
		
		System.out.println(charSet);
		System.out.println(dupCharSet);


}
	
}
