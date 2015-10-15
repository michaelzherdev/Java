package org.mzherdev;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller
//@RequestMapping("/greet")
public class HelloController {//extends AbstractController{

//	@Override
//	protected ModelAndView handleRequestInternal(HttpServletRequest request,
//			HttpServletResponse response) throws Exception {
//		ModelAndView modelAndView = new ModelAndView("welcome");
//		modelAndView.addObject("welcomeMessage", 
//				"Hello! Welocme to the first SpringMVC app!");
//		return modelAndView;
//	}
	
	@RequestMapping("/welcome")
	protected ModelAndView helloWorld() {
		ModelAndView modelAndView = new ModelAndView("/welcome");
		modelAndView.addObject("welcomeMessage", 
				"Hello! Welcome to the first SpringMVC app!");
		return modelAndView;
	}

	@RequestMapping("/hi/{userName}")
	protected ModelAndView hiWorld(@PathVariable("userName") String name) {
		ModelAndView modelAndView = new ModelAndView("/welcome");
		modelAndView.addObject("welcomeMessage", 
				"Hi "+name + "!  Welcome to the first SpringMVC app!");
		return modelAndView;
	}
}
