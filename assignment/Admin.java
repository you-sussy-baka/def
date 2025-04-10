package assignment;

public class Admin extends User {
	public Admin() {
		this("", "", '\u0000');
	}

	public Admin(String username, String password, char gender) {
		super(username, password, gender);
	}

	// methods
	public void menu() {
		System.out.println("Admin menu");
	}
}