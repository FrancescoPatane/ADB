package it.fpmf.acquariumdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import it.fpmf.acquariumdb.rest.RestApiImplService;


@RestController
public class RestInterfaceController {
	
	@Autowired
	private RestApiImplService restServiceImpl;
	


}
