package assignment;

import java.util.ArrayList;

public class Order {
	private String id;
	private ArrayList<OrderItem> orderItems;
	private Payment payment;

	private static int orderCount = 1;
	private static ArrayList<Order> orders = new ArrayList<Order>();

	public Order() {
		this(new ArrayList<OrderItem>(), new Payment());
	}

	public Order(ArrayList<OrderItem> orderItems, Payment payment) {
		this.id = "O" + orderCount++;
		this.orderItems = orderItems;
		this.payment = payment;
		orders.add(this);
	}

	// getters
	public String getId() {
		return id;
	}
	public ArrayList<OrderItem> getOrderItems() {
		return orderItems;
	}
	public Payment getPayment() {
		return payment;
	}
	public static ArrayList<Order> getOrders() {
		return orders;
	}

	// methods
	public double calculateTotal() {
		double total = 0;
		// for (OrderItem orderItem : orderItems) {
		// 	total += orderItem.getVariant().getPrice() * orderItem.getQuantity();
		// }
		return total;
	}
}