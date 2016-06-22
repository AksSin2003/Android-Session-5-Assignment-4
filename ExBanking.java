
public class ExBanking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SBI s=new SBI();
		AXIXS a=new AXIXS();
		ICICI i=new ICICI();
		
		System.out.println("AXIXS bank gives "+a.RateOfInterest()+"% interest rate.");
		System.out.println("SBI bank gives "+s.RateOfInterest()+"% interest rate.");
		System.out.println("ICICI bank gives "+i.RateOfInterest()+"% interest rate.");

	}

}
