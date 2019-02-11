package spring_web08_db;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DAOController {
	
	@RequestMapping(value="list.do")
	public ModelAndView show() {
		
		// jdbcTemplate 을 사용한 class 를 호출
		
		
		return new ModelAndView("list", "list", "this is dept selectAll");
	}
	
	@RequestMapping(value="view.do")
		public String view(HttpServletRequest req) {
			String n = req.getParameter("no");
		
			int deptno = Integer.parseInt(n);
		
			// jdbcTemplate class 호추
			// 매개변ㅅ로 deptno 삽입
			
			req.setAttribute("dataOne",  deptno);
		
			return "view";
		}
	
	@RequestMapping("insert.do")
	public ModelAndView insert() {
		return new ModelAndView();
	}
}
