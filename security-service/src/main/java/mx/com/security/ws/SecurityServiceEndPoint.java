package mx.com.security.ws;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.mycompany.test.security.LoginRequest;
import com.mycompany.test.security.LoginResponse;


@Endpoint
public class SecurityServiceEndPoint {
	
	private static final  String NAMESPACE="http://mycompany.com/test/security";
	
	@PayloadRoot(namespace=NAMESPACE, localPart="loginRequest")
	
	@ResponsePayload 
	public LoginResponse sign(@RequestPayload LoginRequest request ){
		LoginResponse response = new LoginResponse();
		response.setToken("kjhaskdfjvasdbvjhasbavkshdflakvhs(/&%$#");
		return response;
		
	}
	
	
	
	
}
