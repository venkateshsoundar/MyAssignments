package week3.Day1;

public class Audi extends Car{
	public void hybridFuel()
	{
		System.out.println("hybridFuel");
	}
	
	public void applybrake()
	{
		System.out.println("ABS Bracking");
	}
	
	public void getdefaultbrake() {
	super.applybrake();	
	}
	
}
