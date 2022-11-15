package codingChallenge;

public class PhrasePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "A man, a plan, a canal: Panama";
		System.out.println("Input:" + input);
		input = input.replaceAll("[\s,:]", "");
		System.out.println("Input After applying regexp: \n" + input);
		int i = input.length() - 1;
		String rev = "";
		while (i >= 0) {
			rev = rev + input.charAt(i);
			i--;
		}
		System.out.println("Input After reverse: \n" + rev);
		if (input.equalsIgnoreCase(rev)) {
			System.out.println("Given input is PhrasePalindrome");
		} else {
			System.out.println("Given input is not PhrasePalindrome");
		}

	}

}
