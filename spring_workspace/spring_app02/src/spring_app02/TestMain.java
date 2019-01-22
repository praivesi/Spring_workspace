package spring_app02;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	public static void main(String[] args) {
		// 유관순 님이 쌍화차를 마셔요.
		/*Beverage bev = new BeverageImp("쌍화차");
		bev.drink("유관순");*/
		
		// 유관순 님이 다른 음료를 마시고 싶어함 - spring 으로 구현
		
		// 의존 관계에 있어서 xml 에 있는 정보를 스프링이 run time 시 불러와서 동작  <------- DI (Dependency Injection) !! 
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/app.xml"));
		Beverage bev = (Beverage)factory.getBean("bev");
		bev.drink("유관순");
	}
}
