package chainofresponsibilitypattern;

public class Client {

	public static void main(String[] args) {
		
		AuthenticationHandler client = new BasicAuthenticationHandler(
										new ClientCertificateAuthenticationHandler(
												new DigestAuthenticationHandler(null)));
		client.handleRequest("Basic");
		client.handleRequest("digest");
	}

}
