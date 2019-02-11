package spring_aop10_AsjpectJ_anno_JavaConf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class JavaConf {
	
	@Bean
	public CustomerServiceImpl cs() {
		CustomerServiceImpl csi = new CustomerServiceImpl();
		
		csi.setName("이름이다");
		csi.setEmail("이메일이다");
		
		return csi;
	}
	
	@Bean
	public CheckTime ct() {
		CheckTime cct = new CheckTime();
		
		cct.publicTarget();
		
		return cct;
	}
}
