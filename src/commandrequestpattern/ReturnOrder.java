package commandrequestpattern;

public class ReturnOrder implements Command{

	private Order order;
	
	public ReturnOrder(Order order) {
		this.order = order;
	}

	@Override
	public void execute() {
		order.returnOrder();
	}

}
