package mx.com.security;

import mx.com.security.dto.User;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class SecurityController {
	
	protected final Logger logger = Logger.getLogger(getClass());
	
	
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
	public ModelAndView  sign(@ModelAttribute("user") User user, BindingResult result){
		
		logger.info("User "+ user.getUserName() + " pwd " + user.getPwd());
		for (int i = 0; i < 1000; i++) {
			logger.info("Contando" +i);
			
		}
		return new ModelAndView("principal");
	}
	
	

}
