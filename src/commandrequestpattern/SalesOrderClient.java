package commandrequestpattern;

public class SalesOrderClient {
	
	private static Jacket jacket = new Jacket();
	private static Order order = new Order();

	public static void main(String[] args) {
		
		OrderHandler placeOrderHandler = new OrderHandler("Cap");
		OrderHandler returnOrderHandler = new OrderHandler("Shoes");
		
		placeOrderHandler.invoke(new PlaceOrder(order));
		returnOrderHandler.invoke(new ReturnOrder(order));

	}

}
