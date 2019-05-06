package com.hydu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hydu.service.YibuService;

import lombok.extern.slf4j.Slf4j;
/**
 * Òì²½µ÷ÓÃ@Async
 * @author Administrator
 *
 */
@RestController
@Slf4j
public class YibuController {

	@Autowired
	private YibuService yibuService;
	
	@Value("${name}")
	private String name;
	
	@RequestMapping("/addMemberAndEmail")
	public void addMemberAndEmail() throws InterruptedException {
		System.out.println("1");
		Thread.sleep(500);
		String result=yibuService.addMember();
		System.out.println("4");
		System.out.println("result="+result);
		
	}
	
	@RequestMapping("/getName")
	public String getName() {
		return name;
	}
	
	
	@Value("${http_url}")
	private String url;
	@RequestMapping("/getUrl")
	public String getUrl() {
		return url;
	}
}
