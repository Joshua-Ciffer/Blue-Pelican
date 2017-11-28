// Joshua Ciffer 10/1/2017 //

package classroom ;

public class ClassroomTester {
	
	public static void main(String[] args) {
		
		Classroom compSci = new Classroom() ;
		compSci.addStudent("jack") ;
		compSci.classPopulation() ;
		compSci.listNames() ;
		compSci.addStudent("jack") ;
		compSci.addStudent("jacklyn") ;
		compSci.listNames(); 
		compSci.addStudent("dat boi") ;
		compSci.classPopulation() ;
		compSci.listNames() ;
		System.out.println(compSci.findStudent("jacklyn")) ; 
		System.out.println(compSci.findStudent("George Boole")) ;
		compSci.removeStudent("jack") ;
		compSci.removeStudent("mike") ;
		compSci.listNames() ;
		
	}
	
}