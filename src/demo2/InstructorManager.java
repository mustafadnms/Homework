package demo2;

public class InstructorManager extends UserManager {
	
	public void addInstructor(Instructor instructor) {
		System.err.println("Eðitmen eklendi: "+instructor.getFirstName() + instructor.getLastName());
	}
	
	public void deleteInstructor(Instructor instructor) {
		System.err.println("Eðitmen silindi: "+instructor.getFirstName() + instructor.getLastName());
	}
	
	public void addCourse(Instructor instructor) {
		System.err.println("Kurs eklendi: "+instructor.getCourse());
	}
	
	public void deleteCourse(Instructor instructor) {
		System.err.println("Kurs silindi: "+instructor.getCourse());
	}
	
	



}
