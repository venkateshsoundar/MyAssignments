package codingChallenge;

public class Maximalsubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "luffy is still joyboy";
		System.out.println("Input:"+input);
		String[] inp = input.split(" ");
		int length = inp.length;
		inp[length - 1] = inp[length - 1].replaceAll("\"", "");
		System.out.println("Length of last word in a given String: "+inp[length - 1].length());

	}

}
