package gasMileage;
// Joshua Ciffer 7/4/2017

public class Tester2 {

	public static void main(String[] args) {
		
		Automobile myBMW = new Automobile(24) ;
		
		myBMW.fillUp(20) ;
		
		myBMW.takeTrip(100) ;
		
		double fuel_left = myBMW.reportFuel() ;
		
		System.out.println(fuel_left) ; 

	}

}
