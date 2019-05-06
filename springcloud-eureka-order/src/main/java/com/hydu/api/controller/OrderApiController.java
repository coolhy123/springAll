package com.hydu.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderApiController {
	
	//RestTemplate  ��spring�齨�ṩ  Ĭ��������ribbon���ؾ�����
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/getOrder")
	public String getOrder() {
		String memberUrl = "http://app-hydu-member/getMember";
		String result=restTemplate.getForObject(memberUrl, String.class);
		System.out.println("result=="+result);
		return result;
	}

	
	
}
