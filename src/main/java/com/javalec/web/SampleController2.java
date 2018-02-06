package com.javalec.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

//http://localhost:8181/web/doC?msg=sehee
@Controller
public class SampleController2 {
	
	private static final Logger logger = 
			LoggerFactory.getLogger(SampleController2.class);

	@RequestMapping("doC")
	public String doC( @ModelAttribute("msg") String msg){
		//@ModelAttribute�� �ڵ����� �ش� ��ü�� ����� ����
		//msg�̸��� �Ķ���͸� ���ڿ��� ó���Ͽ� �信 ������
		logger.info(">> doC called..............................");
		
		return "result";
		
	}
}