package com.kopo.jaemin;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
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
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "main";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String listMethod(Locale locale, Model model) {
		DBCommon<Student> db = new DBCommon<Student>("c:/tomcat/st.db", "student");
		ArrayList<Student> student = db.selectArrayList(new Student());
		String htmlString = "";
		for (int i = 0; i < student.size(); i++) {
			htmlString = htmlString + "<tr>";
			htmlString = htmlString + "<td>";
			htmlString = htmlString + student.get(i).idx;
			htmlString = htmlString + "</td>";
			htmlString = htmlString + "<td>";
			htmlString = htmlString + student.get(i).name;
			htmlString = htmlString + "</td>";
			htmlString = htmlString + "<td>";
			htmlString = htmlString + student.get(i).score;
			htmlString = htmlString + "</td>";
			htmlString = htmlString + "<td>";
			htmlString = htmlString + student.get(i).created;
			htmlString = htmlString + "</td>";
			htmlString = htmlString + "</tr>";
		}
		model.addAttribute("list", htmlString);		
		return "list";
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insertMethod(Locale locale, Model model) {
		return "insert";
	}
	
	@RequestMapping(value = "/insert_action", method = RequestMethod.GET)
	public String insertAction(Locale locale, Model model
			, @RequestParam("student_name") String name
			, @RequestParam("score") String score) {
		int iScore = Integer.parseInt(score);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
		String now = sdf.format(Calendar.getInstance().getTime());
		DBCommon<Student> db = new DBCommon<Student>("c:/tomcat/st.db", "student");
		db.insertData(new Student(name, iScore, now));
		model.addAttribute("m1", "데이터가 삽입되었습니다.");
		return "message";
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String create(Locale locale, Model model) {
		DBCommon<Student> db = new DBCommon<Student>("c:\\tomcat\\st.db", "student");
		db.createTable(new Student());
		model.addAttribute("m1", "테이블이 생성되었습니다.");
		return "message";
	}
	
	@RequestMapping(value = "/message", method = RequestMethod.GET)
	public String messageMethod(Locale locale, Model model) {
		return "message";
	}
}
