package assignment;

public class Main {
	public static void main(String[] args) {
		User u = new Seller("admin", "admin123", 'M');
		u.menu();
		clearScreen();
		System.out.println("Customer");
	}

	public static void clearScreen() {
		System.out.print("\033\143");
	}

}