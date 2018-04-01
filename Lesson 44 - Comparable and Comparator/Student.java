

@SuppressWarnings("rawtypes")
public class Student implements Comparable {

	private int id;
	
	private String name;
	
	public Student() {
		id = 0;
		name = "";
	}
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "ID: " + id + ", Name: " + name;
	}
	
	@Override
	public int compareTo(Object student) {
		Student student1 = (Student)student;
		if (this.id < student1.getId()) {
			return -1;
		} else if (this.id == student1.getId()) {
			return 0;
		} else {
			return 1;
		}
	}
		
	/**
	 * @return The student's ID.
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return The student's name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param id - The ID to set.
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param name - The name to set.
	 */
	public void setName(String name) {
		this.name = name;
	}



}