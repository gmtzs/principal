package mx.com.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.mycompany.test.security.LoginRequest;
import com.mycompany.test.security.LoginResponse;

@ContextConfiguration(locations="classpath:test-applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class WSTest {

	@Autowired
	private WebServiceTemplate wsTemplate;
	
	@Test
	public void testWS(){
		LoginRequest request = new LoginRequest();
		request.setPassword("12345678");
		request.setSystem("MySystem");
		request.setUserName("userDefault");
		
		LoginResponse response =  (LoginResponse) wsTemplate.marshalSendAndReceive(request);
		System.out.println("Tested... Result " + response.getToken());
	}

	public WebServiceTemplate getWsTemplate() {
		return wsTemplate;
	}

	public void setWsTemplate(WebServiceTemplate wsTemplate) {
		this.wsTemplate = wsTemplate;
	}
	
	
	
}
