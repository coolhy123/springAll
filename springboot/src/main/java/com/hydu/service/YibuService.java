package com.hydu.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;


import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class YibuService {
//	@Async //相当于这个方法开辟了单独的线程进行执行
	//总结  使用AOP技术在运行
	public String  addMember() {
		
		System.out.println("2");
		try {
			
			Thread.sleep(5000);
		}catch (Exception e) {
			
		}
		System.out.println("3");
//		return "String";
	
	new Thread(new Runnable() {
		public void run() {
			System.out.println("2");
			try {
				
				Thread.sleep(5000);
			}catch (Exception e) {
				
			}
			System.out.println("3");
//			return "String";
		}
		
	}).start();
	return "String";
	}
	
	
	
	
//	@Async //相当于这个方法开辟了单独的线程进行执行
//public String  addMember() {
//		
//		System.out.println("2");
//		try {
//			
//			Thread.sleep(5000);
//		}catch (Exception e) {
//			
//		}
//		System.out.println("3");
//		return "String";}
}
