package demo2;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Ahmet");
		student.setLastName("Yýlmaz");
		student.setHomework("Java Ödev");
		student.setProgress(30);
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroð");
		instructor.setCertificate("MCT ,PMP ve ITIL");
		instructor.setCourse("Java/React");
		
		
		System.out.println("Öðrenci: "+student.getFirstName() + student.getLastName());
		
		System.out.println("Eðitmen: "+instructor.getFirstName() + instructor.getLastName());
		
		
		UserManager userManager = new UserManager();
		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
	
		userManager.add(student);
		instructorManager.addInstructor(instructor);
		instructorManager.addCourse(instructor);
		studentManager.addHomework(student);
		
		
	}

}
