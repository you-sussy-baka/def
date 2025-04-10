package assignment;

import java.util.ArrayList;

public class Product {
	private String name;
	private String description;
	private Category category;
	private ArrayList<Variant> variants;
	
	private static ArrayList<Product> products = new ArrayList<Product>();

	public Product() {
		this("", "", new Category());
	}

	public Product(String name, String description, Category category) {
		this.name = name;
		this.description = description;
		this.category = category;
		this.variants = new ArrayList<Variant>();
		products.add(this);
	}

	// getters
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public Category getCategory() {
		return category;
	}
	public ArrayList<Variant> getVariants() {
		return variants;
	}
	public static ArrayList<Product> getProducts() {
		return products;
	}

	// setters
	public void setName(String name) {
		this.name = name;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setCategory(Category category) {
		this.category = category;
	}

	// methods
	public void addVariant(Variant variant) {
		this.variants.add(variant);
	}
	public void removeVariant(Variant variant) {
		this.variants.remove(variant);
	}
	public void removeProduct() {
		
	}
	
}