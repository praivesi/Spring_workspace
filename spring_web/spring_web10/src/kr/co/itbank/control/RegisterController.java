package kr.co.itbank.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterController {
	@RequestMapping("/register/step1.do")
	public String processStep1() {
		return "step1";
	}
}
