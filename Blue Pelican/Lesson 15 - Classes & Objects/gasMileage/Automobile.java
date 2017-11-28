// Joshua Ciffer 7/4/2017 //

package gasMileage ;

public class Automobile {

	private double mpg ;
	private double gallons ;
	
	public Automobile() {
		mpg = 0 ;
		gallons = 0 ;
	}
	
	public Automobile(double gasMileage) {
		mpg = gasMileage ;
		gallons = 0 ;
	}
	
	public void fillUp(double gas) {
		gallons += gas ;
	}
	
	public void takeTrip(double miles) {
		gallons -= miles / mpg ;
	}
	
	public double reportFuel() {
		return gallons ;
	}
	
}