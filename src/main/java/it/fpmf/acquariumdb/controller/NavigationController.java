package it.fpmf.acquariumdb.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavigationController {
	
	
	@GetMapping(value = { "/", "/home" })
	public String home(HttpServletRequest request, HttpServletResponse response) {
		return "/home";
	}

}
