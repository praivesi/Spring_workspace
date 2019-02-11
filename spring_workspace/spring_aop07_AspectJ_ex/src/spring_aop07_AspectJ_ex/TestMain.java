package spring_aop07_AspectJ_ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("app.xml");
		
		Weapon w = ctx.getBean("weapon", Weapon.class);
		
		w.fire();
		
		w.reload();
	}

}
