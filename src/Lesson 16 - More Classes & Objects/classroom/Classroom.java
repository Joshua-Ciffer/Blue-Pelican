// Joshua Ciffer 10/1/2017 //

package classroom ;
import java.util.Scanner ;

public class Classroom {

	private Scanner scanner ;
	private String studentNames ;
	private int numStudents ;

	public Classroom() {
		studentNames = "" ;
		numStudents = 0 ;
	}
	
	public Classroom(String studentName) {
		addStudent(studentName) ;
	}
	
	public void addStudent(String studentName) {
		if (findStudent(studentName)) {
			System.out.println(studentName + " is already in the class.") ;
		} else {
			studentNames = studentNames + ", " + studentName ;
			numStudents++ ;
		}
	}
	
	public boolean findStudent(String studentName) {
		if (studentNames.toLowerCase().contains(studentName)) {
			return true ;
		} else {
			return false ;
		}
	}
	
	public void classPopulation() {
		if (numStudents == 1) {
			System.out.println("The class has " + numStudents + " student.") ;
		} else {
			System.out.println("The class has " + numStudents + " students.") ;
		}
	}
	
	public void listNames() {
		scanner = new Scanner(studentNames) ;
		scanner.useDelimiter(",") ;
		int i = 1 ;
		System.out.println("List of Students");
		while (scanner.hasNext()) {
			System.out.println("#" + i + ": " + scanner.next()) ;
			i++ ;
		}
		scanner.close() ;
	}
	
	public void removeStudent(String studentName) {
		if (findStudent(studentName)) {
			studentNames = studentNames.replace(studentName + ", ", "") ;
			System.out.println(studentName + " was removed from the class.") ;
		} else {
			System.out.println("Failed to remove" + studentName + " from the class.") ;
		}
	}

}