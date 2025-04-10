package assignment;

import java.util.ArrayList;

public class Shipping {
	private String trackingNumber;
	private String recipientName;
	private Address address;
	private String contactNumber;
	private String status;

	private static int nextTrackingNumber = 0;

	public Shipping() {
		this("", new Address(), "");
	}

	public Shipping(String recipientName, Address address, String contactNumber) {
		this.recipientName = recipientName;
		this.address = address;
		this.contactNumber = contactNumber;
		this.status = "Pending";
		this.trackingNumber = "T" + Shipping.nextTrackingNumber++;
	}

	// getters
	public String getTrackingNumber() {
		return trackingNumber;
	}
	public String getRecipientName() {
		return recipientName;
	}
	public Address getAddress() {
		return address;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public String getStatus() {
		return status;
	}

	// setters
	public void setStatus(String status) {
		this.status = status;
	}
}