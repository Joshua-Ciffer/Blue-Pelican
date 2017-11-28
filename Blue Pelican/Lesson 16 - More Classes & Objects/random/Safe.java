package random;
// Joshua Ciffer 9/18/2017 //

public class Safe {

	private String brand, color ;
	private int combination ;
	private boolean isOpen ;
	
	public Safe() {
		brand = "" ;
		color = "" ;
		combination = 0 ;
		isOpen = false ;
	}
	
	public Safe(int combination) {
		brand = "" ;
		color = "" ;
		this.combination = combination ;
		isOpen = false ;
	}
	
	public Safe(String brand, String color, int combination, boolean isOpen) {
		this.brand = brand ;
		this.color = color ;
		this.combination = combination ;
		this.isOpen = isOpen ;
	}
	
	public void setCombination(int combination) {
		changeCombination(combination) ;
	}
	
	private void changeCombination(int combination) {
		this.combination = combination ;
	}
	
	public void openLock(int password) {
		if (password == combination) {
			isOpen = true ;
			System.out.println("Safe is open.") ;
		} else {
			isOpen = false ;
			System.out.println("Wrong combination.") ;
		}
	}
	
	public String getBrand() {
		return brand ;
	}
	
	public String getColor() {
		return color ;
	}
	
	public int getCombination() {
		return combination ;
	}
	
	public boolean checkIfOpen() {
		return isOpen ;
	}
	
	
}