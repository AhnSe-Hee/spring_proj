package com.javalec.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.javalec.domain.ProductVO;

//http://localhost:8181/web/doJSON
@Controller
public class SampleController5 {

	//STS내장브라우저 사용 시 응답 JSON데이터가 출력되지 않고 다운됨
	@RequestMapping("/doJSON")
	public @ResponseBody ProductVO doJSON(){
		
		ProductVO vo = new ProductVO("샘플상품",30000);
		
		return vo; //리턴타입이 일반 객체임
	}
}