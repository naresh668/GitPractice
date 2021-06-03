package com.order.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	
	
	
	
	@GetMapping("/check")
	public ResponseEntity<String> doCheck(){

		
		
		
		//HttpEntity<String> response=new HttpEntity<>();
		return null;
		
		
		
	}

}
