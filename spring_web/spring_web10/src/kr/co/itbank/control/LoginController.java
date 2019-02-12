package kr.co.itbank.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping(value="/member/login.do")
	public String login() {
		return "login/login";
	}
}
