package week1.Day2;

public class Cars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		// Private Method
	//	int sub=obj.SubNumbers(10, 5);
	//	System.out.println(sub);
		
		int div=obj.DivNumbers(20, 5);
		System.out.println(div);

	}

}
