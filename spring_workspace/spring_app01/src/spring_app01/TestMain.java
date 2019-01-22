package spring_app01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	public static void main(String[] args) {
		/*// 홍길동님 안녕하세요
		HelloKr h = new HelloKr();
		h.sayHello("홍길동님");
		
		// 홍길동님 こんにちは
		HelloJp hj = new HelloJp();
		hj.sayHello("홍길동님");*/
		
		// 위처럼 구동하기 위해 XML로 설정하고 파일을 읽어오려고 함
		
		// 1. 스프링 컨테이너를 통해 읽어들이기
		BeanFactory factory = new XmlBeanFactory(
				new FileSystemResource("src/app.xml"));
		
		Object obj = factory.getBean("h"); // xml bean tag - id 속성으로 찾아옴
		System.out.println("obj : " + obj);
		
		Hello h = (Hello)obj;
		h.sayHello("홍길동님");
		
		// 홍길동님 你好 => 출력해보세요
		
	}

}
