package com.hydu.error;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobleException {
	
	@ResponseBody
	@ExceptionHandler(RuntimeException.class)
	public Map<String, Object> getError(){
		Map<String, Object> errorResoult=new HashMap<String, Object>();
		errorResoult.put("errorCode", "500");
		errorResoult.put("errorMsg", "ȫ�ֲ����쳣ϵͳ���󣡣�");
		return errorResoult;
		
	}

}
