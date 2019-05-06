package com.hydu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorTest {

	@RequestMapping("/getError")
	public String errorTest(int i) {
		int j=0;
		j=1/i;
		return "SUCCESS"+j; 
	}
}
