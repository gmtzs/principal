package com.banorte.securityws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.banorte.securityws.component.UserRepository;
import com.banorte.securityws.domain.GetUserRequest;
import com.banorte.securityws.domain.GetUserResponse;


@Endpoint
public class SecurityEndPoint {

	private static final String NAMESPACE_URI = "http://banorte.com/securityws/domain";
	
	@Autowired
	private UserRepository userRepository;

	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getUserRequest")	
	@ResponsePayload
    public GetUserResponse getUser(@RequestPayload GetUserRequest request) {
		System.out.println(request.getUserName());
		GetUserResponse  response = new GetUserResponse();
		response.setResult(true);
        return response;
    }
	
	
	public UserRepository getUserRepository() {
		return userRepository;
	}

	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
}
