package demo2;

public class UserManager {
	
	public void add(User user) {
		System.out.println("Kullan�c� kaydedildi: "+user.getFirstName() + user.getLastName());
		
	}
	
	public void delete(User user) {
		System.out.println("Kullan�c� silindi: "+user.getFirstName() + user.getLastName());
		
	}


}
