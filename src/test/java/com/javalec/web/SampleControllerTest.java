package com.javalec.web;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class SampleControllerTest {
	
	private static final Logger logger = 
			LoggerFactory.getLogger(SampleControllerTest.class);

	@Inject
    private WebApplicationContext wac;

    private MockMvc mockMvc;
    
    @Before //매번 Test전에 가상의 요청, 응답 처리위해 MockMvc 객체를 생성함
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build(); //브라우저의 요청,응답을 의미하는 객체
        logger.info("setup............");
    }
    
    @Test
    public void testDoA() throws Exception{
    	mockMvc.perform(MockMvcRequestBuilders.get("/doA")); //GET 호출
    }

}
