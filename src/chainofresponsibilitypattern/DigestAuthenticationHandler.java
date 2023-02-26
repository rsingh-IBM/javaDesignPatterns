package chainofresponsibilitypattern;

public class DigestAuthenticationHandler extends AuthenticationHandler {
	
	public DigestAuthenticationHandler(AuthenticationHandler handler) {
		super(handler);
	}
	public void handleRequest(String requestType) {
		if(requestType.equalsIgnoreCase("digest")) {
			System.out.println("This is a digest authentication..");
		}else {
			super.handleRequest(requestType);
		}
	}

}
