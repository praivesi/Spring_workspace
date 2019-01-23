package spring_app04;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/connection.xml"));
		
		CommonDAO dao = factory.getBean("m", CommonDAO.class);
		
		//dao.selectAll();
		dao.selectOne(10);
	}
}
