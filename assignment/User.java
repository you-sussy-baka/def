package assignment;

import java.util.ArrayList;
import java.time.LocalDateTime;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public abstract class User {
	private String username;
	private String passwordHash;
	private char gender;
	private boolean isBanned;
	private LocalDateTime createdAt;
	private static ArrayList<User> users = new ArrayList<User>();

	public User() {
		this("", "", '\u0000');
	}

	public User(String username, String password, char gender) {
		this.username = username;
		this.passwordHash = toSha256(password);
		this.gender = gender;
		this.isBanned = false;
		this.createdAt = LocalDateTime.now();
		users.add(this);
	}

	// getters
	public String getUsername() {
		return username;
	}
	public char getGender() {
		return gender;
	}
	public boolean isBanned() {
		return isBanned;
	}

	// setters
	public void setUsername(String username) {
		this.username = username;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setBanned(boolean isBanned) {
		this.isBanned = isBanned;
	}

	// methods
	public static String toSha256(String password) {
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			byte[] bytes = md.digest(password.getBytes());

			StringBuilder sb = new StringBuilder();
			for (byte b : bytes) {
				sb.append(String.format("%02x", b));
			}
			return sb.toString();
		} catch (NoSuchAlgorithmException e) {
			return null;
		}
	}
	
	public static User findByUsername(String username) {
		for (User user : users) {
			if (user.username.equals(username)) {
				return user;
			}
		}
		return null;
	}

	public boolean checkPassword(String password) {
		return this.passwordHash.equals(toSha256(password));
	}

	public static User verifyLogin(String username, String password) {
		User user = findByUsername(username);
		if (user == null) {
			System.out.println("User not found");
			return null;
		}

		if (!user.checkPassword(password)) {
			System.out.println("Wrong password");
			return null;
		}

		if (user.isBanned) {
			System.out.println("User is banned");
			return null;
		}

		return user;
	}

	public boolean deleteUser() {
		return users.remove(this);
	}

	public boolean changeUsername(String newUsername) {
		if (findByUsername(newUsername) != null) {
			System.out.println("Username already exists");
			return false;
		}

		this.username = newUsername;
		return true;
	}

	public boolean changePassword(String oldPassword, String newPassword) {
		if (!this.checkPassword(oldPassword)) {
			System.out.println("Wrong password");
			return false;
		}

		if (this.checkPassword(newPassword)) {
			System.out.println("New password must be different from old password");
			return false;
		}
		
		this.passwordHash = toSha256(newPassword);
		return true;
	}

	public abstract void menu();
}