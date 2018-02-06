package com.javalec.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

//http://localhost:8181/web/doE
@Controller
public class SampleController4 {
	
	private static final Logger logger = 
			LoggerFactory.getLogger(SampleController4.class);

	@RequestMapping("/doE")
	public String doE(RedirectAttributes rttr){
		logger.info(">> doE called but redirect to /doF.............");
		
		rttr.addFlashAttribute("msg", "This is the Message!! with redirected");
		//URI에 보이지 않게 msg라는 이름의 임시 데이터 전달
		
		return "redirect:/doF";
	}
	
	@RequestMapping("/doF")
	public void doF(@ModelAttribute("msg") String msg){
		
		logger.info(">> doF called : medelAttribute(\"msg\") : "+ msg);
	}
}
