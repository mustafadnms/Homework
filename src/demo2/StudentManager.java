package demo2;

public class StudentManager extends UserManager{
	
	public void addHomework(Student student) {
		System.out.println("Ödev eklendi: "+student.getHomework());
		
	}
	
	public void deleteHomework(Student student) {
		System.out.println("Ödev silindi: "+student.getHomework());
		
	}
	
	
	
	


}
