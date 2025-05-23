package assignment;

public class Address {
	private String street;
	private String city;
	private String state;
	private String postalCode;
	private String country;
	
	public Address() {
		this("", "", "", "", "");
	}

	public Address(String street, String city, String state, String postalCode, String country) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.country = country;
	}

	public String toString() {
		return street + ", " + city + ", " + state + ", " + postalCode + ", " + country;
	}
}