// Joshua Ciffer 3/27/2017
public class Lesson_Six_Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String d1_equation = "d1 = 3PIsin(187*) + |cos(122*)|" ;
		String d2_equation = "d2 = (14.72)3.801 + ln(72)" ;
		System.out.println(d1_equation) ;
		System.out.println(d2_equation) ;
		double d1 = (3 * Math.PI * Math.sin(Math.toRadians(187)) + (Math.abs(Math.cos(Math.toRadians(122))))) ;
		double d2 = Math.pow(14.72, 3.801) + Math.log(72) ;
		System.out.println("d1 = " + d1) ;
		System.out.println("d2 = " + d2) ;
		
	}

}
