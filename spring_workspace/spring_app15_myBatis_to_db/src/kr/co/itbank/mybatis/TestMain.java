package kr.co.itbank.mybatis;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("app.xml");
		
		DAO d = context.getBean("dao", DAO.class);
		
		List<DeptDTO> list = d.selectAll();
		
		for(DeptDTO dto: list) {
			System.out.println("부서번호 : " + dto.getDeptno() + "\t" +
									"부서이름 : " + dto.getDname() + "\t" +
									"부서위치 : " + dto.getLoc());
		}
	}
}
