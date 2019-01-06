package oop;

public class newOrder {
	
	//define variables
	String orderNum;
	String orderName;
	String price;
	static final String branchLocation = "Northampton";
	
	//constructor
	newOrder() {
		System.out.println("NEW ORDER");
	}
	
	//overloaded constructor
	newOrder(String orderName, double price) {
		System.out.println("NEW ORDER");
		System.out.println("Order Name: " + orderName);
		System.out.println("Total Price: £" + price);
	}
	

}
