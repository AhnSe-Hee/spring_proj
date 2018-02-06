package com.javalec.web;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
//locations �Ӽ� ����� xml������ �̿��ؼ� ������ �ε��ǵ��� �ϴ� �κ�
public class DataSourceTest {

	@Inject //�������� root-context.xml ���� ���� bean ��ü�� �����ؼ� ��������
	private DataSource ds;
	
	@Test
	public void testConection()throws Exception{
		
		try(Connection con = ds.getConnection()){
			System.out.println(con); //Connection ��ü ���� Ȯ��
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
