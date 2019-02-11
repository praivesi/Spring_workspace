package kr.co.itbank;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HiController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String data = request.getParameter("data");
		
		ModelAndView mav = new ModelAndView("hi", "msg", "오버로딩을 통한 메시지 전달");
		mav.addObject("data", data);
		
		return mav;
	}

}
