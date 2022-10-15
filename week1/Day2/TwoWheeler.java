package week1.Day2;

public class TwoWheeler {
	
	int noOfWheels=2;
	short noOfMirrors=4;
	long chassisNumber=987654321;
	boolean isPunctured=false;

	String bikeName= "KTMDuke";
	double runningKM= 20000.89;

	public static void main(String[] args) {
	
		TwoWheeler twhe =new TwoWheeler ();
		
		System.out.println(twhe.noOfWheels);
		System.out.println(twhe.noOfMirrors);
		System.out.println(twhe.chassisNumber);
		System.out.println(twhe.isPunctured);
		System.out.println(twhe.bikeName);
		System.out.println(twhe.runningKM);
			
	}

	
}
