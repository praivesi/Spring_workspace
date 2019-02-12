package kr.co.itbank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SurveyController {
	@RequestMapping("/survey/survey.do")
	public String survey(){
		return "/survey/surveyForm";
	}
	
	@RequestMapping("/survey/surveyOk.do")
	public String surveyOk() {
		return "survey/summitted";
	}
}
