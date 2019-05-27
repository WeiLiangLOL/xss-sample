package xss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping(path = {"", "/index"})
	public String index() {
		return "index";
	}
	
	@RequestMapping(path = "/search")
	public String pathing() {
		return "404";
	}
	
}
