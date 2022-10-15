package week3.Day3;

public class MyVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("****Car*****");
		Car car = new Car();
		car.applybrake();
		car.soundHorn();
		car.openSunroof();

		System.out.println("****Auto*****");
		Auto auto = new Auto();
		auto.applybrake();
		auto.soundHorn();
		auto.handStarter();

		System.out.println("****BMW*****");
		Bmw bmw = new Bmw();
		bmw.applybrake();
		bmw.soundHorn();
		bmw.openSunroof();
		bmw.autoPark();

		System.out.println("****AUDI*****");
		Audi audi = new Audi();
		audi.applybrake();
		audi.soundHorn();
		audi.openSunroof();
		audi.hybridFuel();

		System.out.println("****BAJAJ*****");

		Bajaj bajaj = new Bajaj();
		bajaj.applybrake();
		bajaj.soundHorn();
		bajaj.handStarter();
		bajaj.electronicMeter();
	}

}
