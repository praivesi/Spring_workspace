package spring_aop04_after_throw_advice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("app.xml");
		
		Message msg = ctx.getBean("proxy", Message.class);
		
		msg.printMsg();
		
		try {
			msg.printThrowException();
		}
		catch (Exception e) {
			System.out.println("예외 발생");
		}
	}

}
