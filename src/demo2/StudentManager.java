package demo2;

public class StudentManager extends UserManager{
	
	public void addHomework(Student student) {
		System.out.println("�dev eklendi: "+student.getHomework());
		
	}
	
	public void deleteHomework(Student student) {
		System.out.println("�dev silindi: "+student.getHomework());
		
	}
	
	
	
	


}
