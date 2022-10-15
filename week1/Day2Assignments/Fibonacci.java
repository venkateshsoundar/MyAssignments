package week1.Day2Assignments;

import java.util.Iterator;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0,1,1,2,3,5,8,13
		int num1=0;
		int num2=1;
		System.out.println(num1);
		System.out.println(num2);
		for(int i=0;i<8;i++) {
			int sum=0;			
			sum=num1+num2;
			System.out.println(sum);
			num1=num2;
			num2=sum;
			
		}

	}

}
