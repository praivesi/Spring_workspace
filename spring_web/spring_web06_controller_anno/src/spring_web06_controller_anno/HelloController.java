package spring_web06_controller_anno;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping(value="hello.do")
	public String sayHello(HttpServletRequest req) {
		String data = req.getParameter("data");
		
		req.setAttribute("data", data);
		
		return "hello";
	}
}
