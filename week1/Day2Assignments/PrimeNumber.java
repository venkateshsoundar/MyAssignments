package week1.Day2Assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number=2;
boolean flag= true;
 
 for (int i=2;i<=number/2;i++) {
	 if (number%i ==0) {
		 flag=false;
		 break;
	 }
	 
 }
 
 if(flag) {
	 System.out.println("Prime");
 }
 else {
	 System.out.println("Not Prime");
 }

	}

}
