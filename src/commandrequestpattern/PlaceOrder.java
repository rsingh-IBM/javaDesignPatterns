package commandrequestpattern;

public class PlaceOrder implements Command{

	private Order order;
	
	public PlaceOrder(Order order) {
		this.order = order;
	}

	@Override
	public void execute() {
		order.placeOrder();
		
	}

}
