package com.javalec.persistence;


import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import com.javalec.domain.MemberVO;

//DAO 인터페이스를 구현함
@Repository // DAO를 스프링에 인식시킴
public class MemberDAOImpl implements MemberDAO {
	
	@Inject
	private SqlSession sqlSession;

	private static final String namespace = "com.javalec.mapper.MemberMapper";

	@Override
	public String getTime() {
		return sqlSession.selectOne(namespace+".getTime");
	}


	@Override
	public void insertMember(MemberVO vo) {
		sqlSession.insert(namespace+".insertMember", vo);
	}


	@Override
	public MemberVO readMember(String userid) throws Exception {
		return (MemberVO) sqlSession.selectOne(namespace+".selectMember", userid);
	}


	@Override
	public MemberVO readWithPW(String userid, String pw) throws Exception {
		//파라미터가 2개 이상 전달되는 경우이므로, Map 타입의 객체를 구성해서 파라미터로 사용
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("userid", userid);
		paramMap.put("userpw", pw);
		
		return sqlSession.selectOne(namespace+".readWithPW", paramMap);
	}

}