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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import mx.com.security.dto.User;


@Controller
@Scope("request")
public class SecurityController {
	
	protected final Logger logger = Logger.getLogger(getClass());
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView  init(
			@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout){
		logger.info("Inicia aplicacion");
		ModelAndView model = new ModelAndView("login");
		if (error != null) {
			logger.info("error");
			model.addObject("msg", "Invalid username and password!");
			
		}

		if (logout != null) {
			logger.info("succesfull!!!");
			model.addObject("msg", "You've been logged out successfully.");
			
		}
		return model;
	}
	
	//Spring Security see this :
		@RequestMapping(value = "/authprincipal", method = RequestMethod.GET)
		public ModelAndView login() {

			return new ModelAndView("principal");
		}

	
	@RequestMapping(value="/authusuario", method=RequestMethod.GET)
	public ModelAndView  admonUsuarios(HttpServletRequest request){
		return new ModelAndView("usuarios");
	}
	
	
	
	
}
