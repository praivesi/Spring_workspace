package kr.co.itbank.www;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// ModelAndView : Model + View
		// Model : 전달한 데이터	
		// View : 찾아갈 view name (주소)
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg", "안녕하세요");
		mav.setViewName("hello");

		
		
		return null;
	}
}
