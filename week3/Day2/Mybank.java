package week3.Day2;

public class Mybank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hdfcbank hdfc = new Hdfcbank();
		hdfc.provideCreditcard();
		hdfc.DebitCard();
		hdfc.minimunBalance();
		
		Reservebank rbi = new Hdfcbank();
		rbi.DebitCard();
		rbi.minimunBalance();
	}

}
