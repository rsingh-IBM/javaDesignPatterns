package chainofresponsibilitypattern;

public class ClientCertificateAuthenticationHandler extends AuthenticationHandler {
	
	public ClientCertificateAuthenticationHandler(AuthenticationHandler handler) {
		super(handler);
	}
	public void handleRequest(String requestType) {
		if(requestType.equalsIgnoreCase("client certificate")) {
			System.out.println("This is a client certificate authentication..");
		}else {
			super.handleRequest(requestType);
		}
	}

}
