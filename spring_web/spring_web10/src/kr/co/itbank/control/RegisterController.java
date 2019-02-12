package kr.co.itbank.control;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.itbank.dto.MemberDTO;

@Controller
public class RegisterController {
	@RequestMapping("/register/step1.do")
	public String processStep1() {
		return "step1";
	}
	
	@RequestMapping("/register/step2.do")
	public String processStep2(HttpServletRequest req) {
		
		// MVC 2 Pattern
		
		String ck = req.getParameter("ck");
		
		if(ck == null) {
			return "step1";
		}else {
			return "step2";
		}
	}
	
	/*@RequestMapping("/register/step3.do")
	public String processStep3(
			//@RequestParam(value="no", defaultValue=0)int no, // 형 변환도 쉽게 할 수 있음
			@RequestParam(value="id", defaultValue="guest", required= true)String id,
			@RequestParam(value="pwd") String pwd,
			@RequestParam(value="confirm") String confirm,
			@RequestParam(value="email") String email,
			Model model) {
		MemberDTO dto = new MemberDTO();
		dto.setId(id);
		dto.setPwd(pwd);
		dto.setConfirm(confirm);
		dto.setEmail(email);
		
		// db에 들어가서 회원정보 입력할 부분
		// ex) MySqLDAO dao = new MySqlDAO(); ...
		
		model.addAttribute("dt", dto);
		
		return "welcome";
	}*/
	
	// 위에 주석 친 processStep3() 와 똑같은 효과
	@RequestMapping("/register/step3.do")
	public String processStep3(
			@ModelAttribute()MemberDTO dto, Model model) {
		model.addAttribute("dto", dto);
		
		return "welcome";
	}
	
	
	@RequestMapping("/main")
	public String processStep4() {
		return "main";
	}
}
























