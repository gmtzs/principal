package mx.com.security.ws;

import mx.com.security.dto.User;

public interface SecurityService {
	
	public User checkUser(String userName, String pwd);
	
	public User addUser(String userName, String pwd);
	
	public User changePassUser(String userName, String pwd);
	
	public boolean deleteUser(String userName);
	
	

}
