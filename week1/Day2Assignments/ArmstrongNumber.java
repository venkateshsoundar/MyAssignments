package week1.Day2Assignments;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=0;
		int sum=0,r=0;
		int temp=number;
		
		while(number > 0) {
			r=number%10;			
			number=number/10;
			sum=sum+(r*r*r);
			
		}
		
		if(sum==temp) {
			System.out.println("Number is Armstrong");
		}
		
	}

}
