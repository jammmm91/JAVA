package com.kopo.memoprogram;

import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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

@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		model.addAttribute("m1", "WELCOME<br><br>YOUR<br><br>MEMOKIT<br><br>");
		return "main";
	}

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String createTable(Locale locale, Model model) {

		MemoDataBase db = new MemoDataBase();
		boolean isSuccess = db.creatdDB();
		if (isSuccess) {
			model.addAttribute("m1", "Complete");

		} else {
			model.addAttribute("m1", "DB ERROR");
		}
		return "message";
	}

	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert(Locale locale, Model model) {
		//table이 최초로 만들어져 있는지 확인하기
		MemoDataBase db = new MemoDataBase();
		User user = new User();
		int isSuccess = db.loginDB(user);

		if (isSuccess == -1) {
			model.addAttribute("id", "No Name");
			return "insert";
		}
		else {
			model.addAttribute("m1", "Create Table first(No Table)");
			return "message";
		}
		

	}

	@RequestMapping(value = "/insert_action", method = RequestMethod.POST)
	public String insertAction(HttpServletRequest request, Locale locale, Model model) {
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String inputTitle = request.getParameter("title");
		String inputContents = request.getParameter("contents");
		String userId = request.getParameter("id");
		String userpwd = request.getParameter("pwd");

		MemoDataBase db = new MemoDataBase();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String now = sdf.format(Calendar.getInstance().getTime());

		// 첫번째created 시간을 불러오는 메소드 추가
		Memo memo = new Memo(inputTitle, inputContents, now, now, userId, userpwd);
		boolean isSuccess = db.insertDb(memo);
		if (isSuccess) {
			model.addAttribute("m1", "posting complete");
		} else {
			model.addAttribute("m1", "posting error");
		}
		return "message";
	}

	@RequestMapping(value = "/allList", method = RequestMethod.GET)
	public String selectData(Locale locale, Model model) {

		MemoDataBase db = new MemoDataBase();
		String htmlString = db.selectData();
		model.addAttribute("list", htmlString);
		return "list";
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String updatedata(Locale locale, Model model, @RequestParam("id") String id) {

		MemoDataBase db = new MemoDataBase();
		User userInfo = db.selectLoginUser(id);

		if (userInfo != null) {
			model.addAttribute("id", id);
			return "update_check";
		}
		return "update_check";
	}

	@RequestMapping(value = "/check_action", method = RequestMethod.GET)
	public String updatecheck(Locale locale, Model model, @RequestParam("id") String id,
			@RequestParam("check") String check) {

		MemoDataBase db = new MemoDataBase();
		User user = new User(id, check);
		User selectUser = db.selectLoginUser(id);

		if (selectUser != null && check.equals(selectUser.pwd)) {

			Memo memo = db.loginDetailsData(id);
			model.addAttribute("idx", memo.idx);
			model.addAttribute("title", memo.title);
			model.addAttribute("content", memo.content);
			model.addAttribute("created", memo.created);
			model.addAttribute("id", memo.id);
			model.addAttribute("pwd", memo.pwd);
			return "update";

		} else {
			model.addAttribute("m1", "Passwords do not match");
			return "message";
		}
	}

	@RequestMapping(value = "/update_action", method = RequestMethod.GET)
	public String updateAction(Locale locale, Model model, @RequestParam("idx") int idx,
			@RequestParam("update_title") String upTitle, @RequestParam("update_contents") String upContents,
			@RequestParam("created") String created, @RequestParam("id") String id, @RequestParam("pwd") String pwd) {

		MemoDataBase db = new MemoDataBase();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String update_time = sdf.format(Calendar.getInstance().getTime());

		Memo memo = new Memo(idx, upTitle, upContents, created, update_time, id, pwd);
		boolean selectMemo = db.updateData(memo);
		if (selectMemo) {
			model.addAttribute("m1", "update complete");
			return "message";
		} else {
			model.addAttribute("m1", "update error");
			return "message";
		}
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String deleteTable(Locale locale, Model model, @RequestParam("idx") int idx) {

		MemoDataBase db = new MemoDataBase();
		Memo selectMemo = db.detailsData(idx);
		boolean deletMemoData = false;

		if (selectMemo != null) {
			deletMemoData = db.deleteData(idx);
			if (deletMemoData) {
				model.addAttribute("m1", "delete complete");
			} else {
				model.addAttribute("m1", "delete error");
			}
		} else {
			model.addAttribute("m1", "no data here");
		}
		return "message";
	}

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signUpMethod(Locale locale, Model model) {
		return "signup";
	}

	@RequestMapping(value = "/signup_action", method = RequestMethod.GET)
	public String signUpAction(HttpServletRequest request, Locale locale, Model model) {
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		String birthday = request.getParameter("birthday");
		String address = request.getParameter("address");

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String joindate = sdf.format(Calendar.getInstance().getTime());

		User user = new User(id, pwd, name, birthday, address, joindate);
		MemoDataBase db = new MemoDataBase();
		boolean isSuccess = db.signup(user);

		if (isSuccess) {
			model.addAttribute("m1", "Congratulations on becoming a member");
		} else {
			model.addAttribute("m1", "중복된 id가 존재합니다.");
		}
		return "message";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginMethod(Locale locale, Model model) {
		return "login";
	}

	@RequestMapping(value = "/login_action", method = RequestMethod.GET)
	public String loginAction(HttpServletRequest request, Locale locale, Model model) {
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");

		User user = new User(id, pwd);
		MemoDataBase db = new MemoDataBase();
		int isSuccess = db.loginDB(user);

		if (isSuccess > -1) {
			HttpSession session = request.getSession();
			session.setAttribute("is_login", true);
			session.setAttribute("login_id", id);
			session.setAttribute("login_pwd", pwd);

			model.addAttribute("m1", "Login Complete");
			return "message";

		}
		else {
			model.addAttribute("m1", "Login Error.");
			return "message";
		}
	}

	@RequestMapping(value = "/myList", method = RequestMethod.GET)
	public String selectMyData(HttpServletRequest request, Locale locale, Model model) {
		HttpSession session = request.getSession();

		try {
			boolean isLogin = (Boolean) session.getAttribute("is_login");
			String userId = (String) session.getAttribute("login_id");
			String userPwd = (String) session.getAttribute("login_pwd");
			if (isLogin) {
				User user = new User(userId, userPwd);
				MemoDataBase db = new MemoDataBase();
				String htmlString = db.LoginUserMemoList(user);

				model.addAttribute("list2", htmlString);
				return "myList";

			} else {
				model.addAttribute("m1", "We need Login");
				return "message";
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("m1", "Login Error");
			return "message";
		}
	}

	@RequestMapping(value = "/login_insert", method = RequestMethod.GET)
	public String login_insert(HttpServletRequest request, Locale locale, Model model) {
		HttpSession session = request.getSession();

		try {
			boolean isLogin = (Boolean) session.getAttribute("is_login");
			String userId = (String) session.getAttribute("login_id");
			String userPwd = (String) session.getAttribute("login_pwd");

			if (isLogin) {
				MemoDataBase db = new MemoDataBase();

				model.addAttribute("id", userId);
				model.addAttribute("pwd", userPwd);

				return "insert";

			} else {
				model.addAttribute("m1", "Login Error");
				return "message";
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("m1", "DB Error");
			return "message";
		}
	}
}
