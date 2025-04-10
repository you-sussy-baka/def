package assignment;

public class OrderItem {
	private Variant variant;
	private int quantity;
	private Shipping shipping;

	public OrderItem() {
		this(new Variant(), 0, "", new Address(), "");
	}

	public OrderItem(Variant variant, int quantity, String recipientName, Address address, String contactNumber) {
		this.variant = variant;
		this.quantity = quantity;
		this.shipping = new Shipping(recipientName, address, contactNumber);
	}

	// getters
	public Variant getVariant() {
		return variant;
	}
	public int getQuantity() {
		return quantity;
	}
	public Shipping getShipping() {
		return shipping;
	}
}