package commandrequestpattern;

public class OrderHandler {
		String objectName;
	public OrderHandler(String objectName) {
		this.objectName = objectName;
	}

	public void invoke(Command command) {
		command.execute();
	}

}
