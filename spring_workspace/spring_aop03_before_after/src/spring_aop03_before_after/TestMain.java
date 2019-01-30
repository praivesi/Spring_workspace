package spring_aop03_before_after;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("app.xml");
		
		Bank b = context.getBean("proxyBean", Bank.class);
		
		b.transfer(300000);
		
		/*
		 * [ 최종 출력 ]
		 * 
		 * 
		 * 로그인 했다 치고...
		 * ----------------------------
		 * 타갯 메소드 실행 전에 호출된 공통 관심사 (advice) 출력
		 * ----------------------------
		 * 계좌 이체를 시작합니다.
		 * 신사임당 님 계좌에서 300000 원 출금되었습니다.
		 * 자액 : 9700000 원
		 * returnVAlue : null
		 * method : transfer
		 * args : 300000
		 * targe :  spring_aop03_before_after.BankImp
		 * 
		 * [ 오늘날짜.txt ]
		 * 오늘날짜.log 저장합니다.
		 * 
		 * 300000 원 이체되었습니다.
		 * 
		 * 
		 * */
		
	}
}
