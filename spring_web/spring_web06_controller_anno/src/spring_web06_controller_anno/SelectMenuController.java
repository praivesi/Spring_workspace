package spring_web06_controller_anno;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// 이전까지 작업은 한 컨트롤러에서 하나의 작업을 하는 형태
// 그러므로 프로젝트가 커지면 controller가 많이 필요해지는 불편함(단점)이 생김

// 이러한 단점을 보완하기 위해 annotation을 사용

@Controller
public class SelectMenuController {
	@RequestMapping(value="selectMenu.do")
	public ModelAndView aaa() { // 메소드 이름은 개발자 마음대로... 어차피 안쓰임
		return new ModelAndView("menu", "test", "첫번째 페이지");
	}
	
	@RequestMapping(value="data.do")
	public ModelAndView bbb() {
		return new ModelAndView("menu", "test2", "두번째 페이지");
		
	}
}
