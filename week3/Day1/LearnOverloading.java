package week3.Day1;

public class LearnOverloading {

	public static void main(String[] args) {

		
		// TODO Auto-generated method stub
		LearnOverloading ovrload=new LearnOverloading();
		ovrload.add(2, 5);
		ovrload.add(2, 5,8);
		ovrload.add(2.534F, 5.5F);
		ovrload.add(2.288F, 5);

	}

	public void add(int a, int b) {

		System.out.println("Adding 2 Integers :"+ a + b);
	}

	public void add(int a, int b, int c) {

		System.out.println("Adding 3 Integers :"+a + b + c);
	}

	public void add(float a, float b) {

		System.out.println("Adding 2 Float :"+a + b);
	}

	public void add(int a, float b) {

		System.out.println("Adding 1 Float,1 Int :"+a + b);
	}

}
