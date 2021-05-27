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
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "main";
	}
//	◆◆◆DB common 용◆◆◆
//	@RequestMapping(value = "/list", method = RequestMethod.GET)
//	public String listMethod(Locale locale, Model model) {
//		DBCommon<Student> db = new DBCommon<Student>("c:/tomcat/studentScore.db", "score");
//		ArrayList<Student> student = db.selectArrayList(new Student());
//		String htmlString = "";
//		for (int i = 0; i < student.size(); i++) {
//			htmlString = htmlString + "<tr>";
//			htmlString = htmlString + "<td>";
//			htmlString = htmlString + student.get(i).idx;
//			htmlString = htmlString + "</td>";
//			htmlString = htmlString + "<td>";
//			htmlString = htmlString + student.get(i).name;
//			htmlString = htmlString + "</td>";
//			htmlString = htmlString + "<td>";
//			htmlString = htmlString + student.get(i).middleScore;
//			htmlString = htmlString + "</td>";
//			htmlString = htmlString + "<td>";
//			htmlString = htmlString + student.get(i).finalScore;
//			htmlString = htmlString + "</td>";
//			htmlString = htmlString + "<td>";
//			htmlString = htmlString + student.get(i).created;
//			htmlString = htmlString + "</td>";
//			htmlString = htmlString + "<td>";
//			htmlString = htmlString + "<a href='update?idx=" + student.get(i).idx + "'>수정하기</a>";
//			htmlString = htmlString + "</td>";
//			htmlString = htmlString + "<td>";
//			htmlString = htmlString + "<a href='delete?idx=" + student.get(i).idx + "'>삭제하기</a>";
//			htmlString = htmlString + "</td>";
//			htmlString = htmlString + "</tr>";
//		}
//		model.addAttribute("list", htmlString);		
//		return "list";
//	}
	
//	◆◆◆userDB용◆◆◆
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String listMethod(Locale locale, Model model) {
		UserDB db = new UserDB();
		String htmlString = db.selectData();
		model.addAttribute("list", htmlString);
		return "list";
	}

	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insertMethod(Locale locale, Model model) {
		
		return "insert";
	}
//	◆◆◆DB common 용◆◆◆
//	@RequestMapping(value = "/insert_action", method = RequestMethod.GET)
//	public String insertAction(Locale locale, Model model
//			, @RequestParam("student_name") String name
//			, @RequestParam("middlescore") String middleScore
//			, @RequestParam("finalscore") String finalScore) {
//		int mScore = Integer.parseInt(middleScore);
//		int fScore = Integer.parseInt(finalScore);
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
//		String now = sdf.format(Calendar.getInstance().getTime());
//		DBCommon<Student> db = new DBCommon<Student>("c:/tomcat/studentScore.db", "score");
//		db.insertData(new Student(name, mScore, fScore, now));
//		model.addAttribute("m1", "성적이 입력되었습니다.");
//		
//		return "message";
//	}
	
//	◆◆◆userDB 용◆◆◆
	@RequestMapping(value = "/insert_action", method = RequestMethod.GET)
	public String insertAction(Locale locale, Model model
			, @RequestParam("student_name") String name
			, @RequestParam("middlescore") String middleScoreString
			, @RequestParam("finalscore") String finalScoreString) {
					
		UserDB db = new UserDB();
		double middleScore = Double.parseDouble(middleScoreString);
		double finalScore = Double.parseDouble(finalScoreString);
		db.insertData(name, middleScore, finalScore);	
		model.addAttribute("m1", "성적이 입력되었습니다.");
		
		return "message";
	}
	
//	◆◆◆DBCommon용◆◆◆
//	@RequestMapping(value = "/update", method = RequestMethod.GET)
//	public String updateMethod(Locale locale, Model model, @RequestParam("idx") int idx) {
//		DBCommon<Student> db = new DBCommon<Student>("c:/tomcat/user.db", "score");
//		Student selectStudent = db.detailsData(new Student(), idx);
//		
//		if (selectStudent != null) {
//			model.addAttribute("idx", selectStudent.idx);
//			model.addAttribute("student_name", selectStudent.name);
//			model.addAttribute("middleScore", selectStudent.middleScore);
//			model.addAttribute("finalScore", selectStudent.finalScore);
//		}
//		return "update";
//	}
	
//	◆◆◆UserDB용◆◆◆
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String updateMethod(Locale locale, Model model, @RequestParam("idx") int idx) {
		
		UserDB db = new UserDB();
		Student selectStudent = db.detailsData(idx);

		if (selectStudent != null) {
			model.addAttribute("idx", selectStudent.idx);
			model.addAttribute("student_name", selectStudent.name);
			model.addAttribute("middleScore", selectStudent.middleScore);
			model.addAttribute("finalScore", selectStudent.finalScore);
		}
		return "update";
	}
	
//	◆◆◆DBCommon용◆◆◆
//	@RequestMapping(value = "/update_action", method = RequestMethod.GET)
//	public String updateAction(Locale locale, Model model
//			, @RequestParam("idx") int idx
//			, @RequestParam("student_name") String sname
//			, @RequestParam("middlescore") String middleScore
//			, @RequestParam("finalscore") String finalScore) {
//		int mScore = Integer.parseInt(middleScore);
//		int fScore = Integer.parseInt(finalScore);
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
//		String now = sdf.format(Calendar.getInstance().getTime());
//		
//		DBCommon<Student> db = new DBCommon<Student>("c:/tomcat/user.db", "score");
//		db.updateData(new Student(idx, sname, mScore, fScore, now));
//		
//		model.addAttribute("m1", "성적이 수정되었습니다.");
//		return "message";
//	}
	
//	◆◆◆UserDB용◆◆◆
	@RequestMapping(value = "/update_action", method = RequestMethod.GET)
	public String updateAction(Locale locale, Model model
			, @RequestParam("idx") int idx
			, @RequestParam("student_name") String name
			, @RequestParam("middlescore") String middleScoreString
			, @RequestParam("finalscore") String finalScoreString) {
		UserDB db = new UserDB();
		
		double middleScore = Double.parseDouble(middleScoreString);
		double finalScore = Double.parseDouble(finalScoreString);
		
		db.updateData(idx, name, middleScore, finalScore);

		model.addAttribute("m1", "데이터가 수정되었습니다.");
		return "message";
	}
//	◆◆◆DBcommon용◆◆◆
//	@RequestMapping(value = "/delete", method = RequestMethod.GET)
//	public String delete(Locale locale, Model model,  @RequestParam("idx") int idx) {
//		DBCommon<Student> db = new DBCommon<Student>("c:\\tomcat\\user.db", "studnet");
//		Student deleteStudent = db.detailsData(new Student(), idx);
//				
//		db.deleteData(deleteStudent);
//		model.addAttribute("m1", " 테이블이 삭제되었습니다");
//		return "message";
//	}
	
//	◆◆◆UserDB용◆◆◆
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(Locale locale, Model model,  @RequestParam("idx") int idx) {
		UserDB db = new UserDB();
				
		db.deleteData(idx);
		model.addAttribute("m1", " 테이블이 삭제되었습니다");
		return "message";
	}
	
//	◆◆◆DBcommon용◆◆◆
//	@RequestMapping(value = "/create", method = RequestMethod.GET)
//	public String create(Locale locale, Model model) {
//		DBCommon<Student> db = new DBCommon<Student>("c:\\tomcat\\studentScore.db", "score");
//		db.createTable(new Student());
//		model.addAttribute("m1", "성적 테이블이 생성되었습니다.");
//		return "message";
//	}
	
//	◆◆◆userDB용◆◆◆
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String create(Locale locale, Model model) {
		UserDB db = new UserDB();
		db.createTable();	
		model.addAttribute("m1", "성적 테이블이 생성되었습니다.");
		return "message";
	}
	
	@RequestMapping(value = "/message", method = RequestMethod.GET)
	public String messageMethod(Locale locale, Model model) {
		return "message";
	}
}