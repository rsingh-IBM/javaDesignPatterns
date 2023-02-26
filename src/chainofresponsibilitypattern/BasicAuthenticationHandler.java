package chainofresponsibilitypattern;

public class BasicAuthenticationHandler extends AuthenticationHandler {
	
	public BasicAuthenticationHandler(AuthenticationHandler handler) {
		super(handler);
	}
	
	public void handleRequest(String requestType) {
		if(requestType.equalsIgnoreCase("basic")) {
			System.out.println("This is a basic authentication..");
		}else {
			super.handleRequest(requestType);
		}
	}

}
