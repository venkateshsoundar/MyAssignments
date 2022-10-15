package week1.Day2;

public class Car {
	
	public static void main(String[] args) {
		Car obj = new Car();

		obj.PrintCarName();

		String getColour = obj.GetColour();
		System.out.println(getColour);

		String getRegNumber = obj.GetRegNumber();
		System.out.println(getRegNumber);

		boolean iscarpuncture=obj.IsCarPuncture();
		System.out.println(iscarpuncture);
		
		int add = obj.AddNumbers(5, 3, 2);
		System.out.println(add);
		
		float mul=obj.MulNumbers(2.4f, 3.5f, 6.7f);
		System.out.println(mul);
		
		int sub=obj.SubNumbers(10, 5);
		System.out.println(sub);
		
		int div=obj.DivNumbers(20, 5);
		System.out.println(div);
		
	}

	public void PrintCarName() {
		System.out.println("Honda");
	}

	public String GetRegNumber() {

		return "TN64-8888";
	}

	public String GetColour() {
		return "Yellow";
	}

	public boolean IsCarPuncture() {
		return true;
	}

	public int AddNumbers(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

	private int SubNumbers(int num1, int num2) {
		return num1 - num2;
	}

	float MulNumbers(float num1, float num2, float num3) {
		return num1 * num2 * num3;
	}

	public int DivNumbers(int num1, int num2) {
		return num1 / num2;
	}

}
