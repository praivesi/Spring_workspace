package spring_web07_controller_anno_hw;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewMenuController {
	@RequestMapping(value="viewData.do")
	public ModelAndView viewDataFunc() {
		return new ModelAndView("view", "viewMsg", "viewMsg 닭");
	}
	
	@RequestMapping(value="showData.do")
	public String showDataFunc(HttpServletRequest req) {
		String data = req.getParameter("data");
		
		req.setAttribute("data", data);
		
		return "show";
	}
}
