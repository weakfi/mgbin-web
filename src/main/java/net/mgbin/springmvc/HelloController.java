package net.mgbin.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloController {
	@RequestMapping(value="index",method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		model.addAttribute("message", "Hello Spring MVC Framework!");

		return "index";
	}
	@RequestMapping(value="login",method = RequestMethod.GET)
	public String login(ModelMap model) {
		
		return "login";
	}
	@RequestMapping(value="admin/main",method = RequestMethod.GET)
	public String admin(ModelMap model) {
		
		return "admin/main";
	}
}
