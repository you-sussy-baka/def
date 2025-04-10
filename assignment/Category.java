package assignment;

import java.util.ArrayList;

public class Category {
	private String name;
	private static ArrayList<Category> categories = new ArrayList<Category>();

	public Category() {
		this("");
	}

	public Category(String name) {
		this.name = name;
		categories.add(this);
	}

	// getters
	public String getName() {
		return name;
	}
	public static ArrayList<Category> getCategories() {
		return categories;
	}

	// setters
	public void setName(String name) {
		this.name = name;
	}

	// methods
	public void removeCategory() {
		categories.remove(this);
	}
}