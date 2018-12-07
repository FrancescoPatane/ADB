package it.fpmf.acquariumdb.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import it.fpmf.acquariumdb.model.Family;
import it.fpmf.acquariumdb.rest.RestApiImplService;


@RestController
public class RestInterfaceController {
	
	@Autowired
	private RestApiImplService restServiceImpl;
	
	@GetMapping(value = { "/api/families" })
	public List<Family> home(HttpServletRequest request, HttpServletResponse response) {
		List<Family> result = restServiceImpl.getAllFamilies();
		return result;
	}
	


}
