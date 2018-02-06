package com.javalec.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.javalec.domain.ProductVO;

//http://localhost:8181/web/doJSON
@Controller
public class SampleController5 {

	//STS��������� ��� �� ���� JSON�����Ͱ� ��µ��� �ʰ� �ٿ��
	@RequestMapping("/doJSON")
	public @ResponseBody ProductVO doJSON(){
		
		ProductVO vo = new ProductVO("���û�ǰ",30000);
		
		return vo; //����Ÿ���� �Ϲ� ��ü��
	}
}