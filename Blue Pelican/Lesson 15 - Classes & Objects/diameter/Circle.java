package diameter;
// Joshua Ciffer 6/1/2017

public class Circle {
	
	public Circle() {
		radius = 100 ;
	}
	
	public Circle(double r) {
		radius = r ;
	}
	
	public double area() {
		double a = Math.PI * radius * radius ;
		return a ;
	}
	
	public double circumference() {
		double c = 2 * Math.PI * radius ;
		return c ;
	}
	
	public double radius ;
	
	public double diameter() {
		double d = radius * 2 ;
		return d ;
	}
	
	public void setRadius(double nr) {
		radius = nr ;
	}
	
	public static void main(String[] args) {
		
		Circle cir1 = new Circle(5.1) ;
		Circle cir2 = new Circle(20.6) ;
		System.out.println(cir1.area()) ;
		System.out.println(cir2.circumference()) ;
		double xx = cir1.radius ;
		System.out.println(xx) ;
		cir1.setRadius(23.3) ; 
		
	}
	
}