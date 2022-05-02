package com.sightbase.app.sightbase;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
	
	
	@GetMapping("/api/v1/*")
	public Object hello (HttpServletRequest request) {
		Object nana = request.getAttribute("smth");
		return nana;
	}
}
