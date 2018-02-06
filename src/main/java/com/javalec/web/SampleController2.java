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
		//@ModelAttribute는 자동으로 해당 객체를 뷰까지 전달
		//msg이름의 파라미터를 문자열로 처리하여 뷰에 전달함
		logger.info(">> doC called..............................");
		
		return "result";
		
	}
}