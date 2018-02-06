package com.javalec.persistence;

import com.javalec.domain.MemberVO;

//실제로 실행해야하는 작업을 인터페이스로 정의함
public interface MemberDAO {
	
	public String getTime();
	
	public void insertMember(MemberVO vo);

	public MemberVO readMember(String userid)
			throws Exception;
  
	public MemberVO readWithPW(String userid, String userpw)
			throws Exception;
}