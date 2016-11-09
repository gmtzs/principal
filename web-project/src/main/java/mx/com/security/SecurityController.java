package mx.com.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import mx.com.security.dto.User;


@Controller
@Scope("request")
public class SecurityController {
	
	protected final Logger logger = Logger.getLogger(getClass());
	
	@Autowired
	private User user;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView  init(){
		return new ModelAndView("Sign","user", new User());
	}
	
	@RequestMapping(value="/Sign.htm", method=RequestMethod.GET )
	public ModelAndView sign(){
		logger.info("Paso por aqui");
		return new ModelAndView("Sign","user", new User());
	}
	
//	@RequestMapping(value="/Sign.htm", method=RequestMethod.POST)
//	public ModelAndView  sign(@ModelAttribute("user") User user, BindingResult result){
//		
//		logger.info("User "+ user.getUserName() + " pwd " + user.getPwd());
//		for (int i = 0; i < 1000; i++) {
//			logger.info("Contando" +i);
//			
//		}
//		return new ModelAndView("filePicker");
//	}
	
	@RequestMapping(value="/Sign.htm", method=RequestMethod.POST)
	public ModelAndView  sign(@ModelAttribute("user") User user, BindingResult result, HttpServletRequest request){
		HttpSession session = request.getSession();
		
		
		for (int i = 0; i < 100; i++) {
			logger.info("Contando" +i);
			
		}
		logger.info("User "+ user.getUserName() + " pwd " + user.getPwd());
		return new ModelAndView("principal");
	}
	
	@RequestMapping(value="/usuario.htm", method=RequestMethod.GET)
	public ModelAndView  admonUsuarios(HttpServletRequest request){
		
		logger.info("Usuario en la sesion" + user);
		return new ModelAndView("usuarios");
	}
	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

}
