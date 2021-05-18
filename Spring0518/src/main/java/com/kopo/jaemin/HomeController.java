package com.kopo.jaemin;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String create(Locale locale, Model model) {
		DBCommon<Student> db = new DBCommon<Student>("c:\\tomcat\\st.db", "student");
		db.createTable(new Student());
		model.addAttribute("message", "테이블이 생성되었습니다.");
		return "message";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "main";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String listMethod(Locale locale, Model model) {
		return "list";
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insertMethod(Locale locale, Model model) {
		return "insert";
	}
	
	@RequestMapping(value = "/insert_action", method = RequestMethod.GET)
	public String insertAction(Locale locale, Model model
			, @RequestParam("student_name") String name
			, @RequestParam("score") int score) {
		DBCommon<Student> db = new DBCommon<Student>("c:/tomcat/st.db", "student");
		db.insertData(new Student(name, score));
		model.addAttribute("message", "데이터가 삽입되었습니다.");
		return "message";
	}
	
	@RequestMapping(value = "/select_action", method = RequestMethod.GET)
	public String selectAction(Locale locale, Model model
			, @RequestParam("student_name") String name
			, @RequestParam("score") int score) {
		DBCommon<Student> db = new DBCommon<Student>("c:/tomcat/st.db", "student");
		db.selectData(new Student(name, score));
		model.addAttribute("message", "데이터를 불러왔습니다.");
		return "message";
	}
	
	@RequestMapping(value = "/message", method = RequestMethod.GET)
	public String messageMethod(Locale locale, Model model) {
		return "message";
	}
}
