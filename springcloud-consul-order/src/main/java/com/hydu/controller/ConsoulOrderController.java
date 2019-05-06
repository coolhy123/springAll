package com.hydu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsoulOrderController {
	
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private DiscoveryClient discoveryClient;
	
	int conut=1;
	
	@RequestMapping("/getOrder")
	public String getOrder() {
		String result = "helle Order";
		String serviceUrl = getServerUrl("consul-member") + "/getMember";

		System.out.println("result=="+result+serviceUrl);
		return result;
	}
	
	
	public String getServerUrl(String name) {
		List<ServiceInstance> instances = discoveryClient.getInstances(name);
		if(instances!=null&&instances.isEmpty()) {
			return instances.get(0).getUri().toString();
		}else {
			return null;
		}
		
		
	}
	


}
