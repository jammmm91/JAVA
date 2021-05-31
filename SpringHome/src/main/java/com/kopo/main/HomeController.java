package com.kopo.main;

import java.text.DateFormat;
import java.util.Date;
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
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "main";
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String create(Locale locale, Model model) {
		DBCommon<Student> db = new DBCommon<Student>("c:/tomcat/scoreTable.db", "student");
		db.createTable(new Student());
		model.addAttribute("message", "테이블이 생성되었습니다");
				
		return "messagePage";
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert(Locale locale, Model model) {
						
		return "insert";
	}
	
	@RequestMapping(value = "/insert_action", method = RequestMethod.GET)
	public String insertAction(Locale locale, Model model
			, @RequestParam("name") String name
			, @RequestParam("middle") String middleString
			, @RequestParam("final") String finalString) {
		int middleNumber = Integer.parseInt(middleString);
		int finalNumber = Integer.parseInt(finalString);
		
		DBCommon<Student> db = new DBCommon<Student>("c:/tomcat/scoreTable.db", "student");
		db.insertData(new Student(name, middleNumber, finalNumber));
		model.addAttribute("message", "DB에 저장완료!");				
		
		return "messagePage";
	}
		
}
