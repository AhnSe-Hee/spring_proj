package com.javalec.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.javalec.domain.ProductVO;

//http://localhost:8181/web/doD
@Controller
public class SampleController3 {

	private static final Logger logger = 
			LoggerFactory.getLogger(SampleController3.class);
	
	//Model: 스프링에서 제공하는 클래스로 뷰에 원하는 데이터를 전달하는 일종의 컨테이너
	@RequestMapping("/doD")
	public String doD(Model model){
		
		ProductVO product = new ProductVO("Sample Product", 10000); //name, price
		logger.info("doD");
		model.addAttribute(product); //뷰로 전달하기 위해 ProductVO객체를 Model객체에 보관
		//model.addAtribute("product", Product) //객체이름, 객체 클래스명
		//model.addAtribute(product) //첫글자를 소문자 처리한 객체 클래스명
		
		return "productDetail";
		
	}
	
}