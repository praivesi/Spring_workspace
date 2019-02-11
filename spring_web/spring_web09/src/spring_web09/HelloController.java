package spring_web09;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping(value="/hello.do")
	public ModelAndView hello() {
		return new ModelAndView("test", "msg", "msg-anno");
	}
	
	
}
