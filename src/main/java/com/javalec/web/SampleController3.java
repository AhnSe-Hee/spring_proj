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
	
	//Model: ���������� �����ϴ� Ŭ������ �信 ���ϴ� �����͸� �����ϴ� ������ �����̳�
	@RequestMapping("/doD")
	public String doD(Model model){
		
		ProductVO product = new ProductVO("Sample Product", 10000); //name, price
		logger.info("doD");
		model.addAttribute(product); //��� �����ϱ� ���� ProductVO��ü�� Model��ü�� ����
		//model.addAtribute("product", Product) //��ü�̸�, ��ü Ŭ������
		//model.addAtribute(product) //ù���ڸ� �ҹ��� ó���� ��ü Ŭ������
		
		return "productDetail";
		
	}
	
}