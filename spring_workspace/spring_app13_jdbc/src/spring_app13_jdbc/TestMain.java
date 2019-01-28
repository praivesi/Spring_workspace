package spring_app13_jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("app.xml");
		
		DAO d = context.getBean("dao", DAO.class);
		
/*		List<DeptDTO> list = d.selectAll();
		
		for(DeptDTO dto: list) {
			System.out.println("부서번호 : " + dto.getDeptno() + "\t" +
									"부서이름 : " + dto.getDname() + "\t" +
									"부서위치 : " + dto.getLoc());
		}*/
		
		System.out.println("---------------------------");
		
		DeptDTO dto = d.selectOne(10);
		System.out.println(dto.getDeptno() + "\t" + dto.getDname() + "\t" + dto.getLoc());
		
		System.out.println("----------------------------");
		// 데이터 저장
		/*DeptDTO dto2 = new DeptDTO(60, "영업", "종로");
		d.insertOne(dto2);*/
		
		System.out.println("----------------------------");
		// 데이터 수정
	/*	DeptDTO dto3 = new DeptDTO(60, "Q/A", "HQ");
		d.updateOne(dto3);*/
		
		System.out.println("----------------------------");
		// 60번 부서 삭제
		/*d.deleteOne(60);*/
	}
}
