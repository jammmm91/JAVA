package com.kopo.main;

import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.sqlite.SQLiteConfig;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	private String statistical;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
				
		return "main";
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String create(Locale locale, Model model) {
		UserDB userDB = new UserDB();
		boolean isSuccess = userDB.createDB();
		if (isSuccess) {
			model.addAttribute("m1", "테이블이 생성되었습니다.");
		} else {
			model.addAttribute("m1", "DB Error");
		}
		return "message";
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insertMethod(Locale locale, Model model) {
		return "insert";
	}
	
	@RequestMapping(value = "/insert_action", method = RequestMethod.POST)
	public String insertAction(HttpServletRequest request, Locale locale, Model model) {

		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String sex = request.getParameter("sex");
		
		Resident member = new Resident(name, age, sex);

		UserDB userDB = new UserDB();
		boolean isSuccess = userDB.insertDB(member);
		if (isSuccess) {
			model.addAttribute("m1", "데이터가 입력되었습니다.");
		} else {
			model.addAttribute("m1", "이름이 중복되었거나 DB에 이상이 있습니다.");
		}
		return "message";
	}
	
//	주민정보조회
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String listMethod(Locale locale, Model model) {
					
				UserDB db = new UserDB();
				String htmlString = db.selectData();
				model.addAttribute("list", htmlString);

				return "list";
		}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String updateMemoMethod(HttpServletRequest request, @RequestParam("idx") int idx, Locale locale, Model model) {
	
		UserDB db = new UserDB();
		Resident p1 = db.detailsData(idx);
				
		model.addAttribute("original_idx", p1.idx);
		model.addAttribute("original_name", p1.name);
		model.addAttribute("original_age", p1.age);
		model.addAttribute("original_sex", p1.sex);
	
		return "update";
	}
	

	@RequestMapping(value = "/update_action", method = RequestMethod.POST)
	public String updateMethod(HttpServletRequest request, Locale locale, Model model) {
	
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		UserDB db = new UserDB();
		HttpSession session = request.getSession();
		
		String idxString = request.getParameter("idx");
		int idx = Integer.parseInt(idxString);
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String sex = request.getParameter("sex");
		
		boolean isSuccess = db.updateData(idx, name, age, sex);
		
		if (isSuccess) {
			model.addAttribute("m1", "정보가 수정되었습니다.");
		} else {
			model.addAttribute("m1", "DB error");
		}				
		return "message";							
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(Locale locale, Model model, @RequestParam("idx") int idx) {

		UserDB userDB = new UserDB();
		boolean isSuccess = userDB.deleteData(idx);
		if (isSuccess) {
			model.addAttribute("m1", "입주자 정보가 삭제되었습니다.");
		} else {
			model.addAttribute("m1", "입주자정보 삭제에 실패하였습니다.");
		}
		return "message";
	}
	
	@RequestMapping(value = "/statistical", method = RequestMethod.GET)
	public String statisticalMethod(HttpServletRequest request, Locale locale, Model model) throws ClassNotFoundException, SQLException {
		
		Class.forName("org.sqlite.JDBC");
		SQLiteConfig config = new SQLiteConfig();
		Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:\\tomcat\\residentInfo.db", config.toProperties());

		String query = "select count(*) from resident";
		Statement statement = connection.createStatement();
		int result = statement.executeUpdate(query);
		
		String query1 = "select avg(age) from resident";
		Statement statement1 = connection.createStatement();
		int result1 = statement1.executeUpdate(query1);
		
		String query2 = "";
		Statement statement2 = connection.createStatement();
		int result2 = statement2.executeUpdate(query2);
		
		
		model.addAttribute("totalMember", result);
		model.addAttribute("totalavgAge", result1);
		model.addAttribute("totalratioSex", result2);
		
		
		return "statistical";
		
	}
	
	@RequestMapping(value = "/insertApt", method = RequestMethod.GET)
	public String insertAptMethod(Locale locale, Model model) {

				return "insertApt";
		}
	
	@RequestMapping(value = "/insertApt_action", method = RequestMethod.POST)
		public String insertAptAction(HttpServletRequest request, Locale locale, Model model) {

			try {
				request.setCharacterEncoding("utf-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}

			String name = request.getParameter("name");
			
			Apartment apt = new Apartment(name);

			UserDB db = new UserDB();
			boolean isSuccess = db.insertApt(apt);
			if (isSuccess) {
				model.addAttribute("m1", "데이터가 입력되었습니다.");
			} else {
				model.addAttribute("m1", "이름이 중복되었거나 DB에 이상이 있습니다.");
			}
			return "message";
		}
	}
