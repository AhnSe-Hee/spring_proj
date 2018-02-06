package com.javalec.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.javalec.domain.MemberVO;
import com.javalec.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
	locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class MemberDAOTest {

	@Inject
	private MemberDAO dao; //DAO 주입
	
	@Test
	public void testTime()throws Exception{
		System.out.println(dao.getTime()); //현재 시간 출력
	}
	
	@Test
	public void testInsertMember()throws Exception{
		MemberVO vo = new MemberVO(); //
		vo.setUserid("ahns0206");
		vo.setUserpw("235689");
		vo.setUsername("ahnsehee");
		vo.setEmail("ahnsehee@gmail.com");
		
		dao.insertMember(vo);
		
	}	

}