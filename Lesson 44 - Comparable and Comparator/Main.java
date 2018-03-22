
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Joshua Ciffer
 * @version 03/20/2018
 */
public class Main {

	private static Scanner userInput = new Scanner(System.in);
	
	private static ArrayList<Student> studentList = new ArrayList<>();
	
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			System.out.print("Enter the students name: ");
			studentList.add(new Student(i, userInput.nextLine()));
		}

		for (Student stud : studentList) {
			System.out.println(stud);
		}
		userInput.close();
	}

}