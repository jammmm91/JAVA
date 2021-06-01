package www.kopo.main;

import java.text.SimpleDateFormat;
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
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String create(Locale locale, Model model) {
		UserDB db = new UserDB();
		
		boolean isSuccess = db.createDB();
		if (isSuccess) {
			model.addAttribute("mg", "Table creation complete");
		} else {
			model.addAttribute("mg", "Table creation error");
		}		
		return "message";

	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert(Locale locale, Model model) {
		return "insert";
	}
	
	@RequestMapping(value = "/insert_action", method = RequestMethod.GET)
	public String insertAction(Locale locale, Model model
			,@RequestParam("user_id") String id
			,@RequestParam("user_pwd") String pwd
			,@RequestParam("user_name") String name
			,@RequestParam("user_birthday") String birthday
			,@RequestParam("user_address") String address) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String now = sdf.format(Calendar.getInstance().getTime());
				
		User user = new User (id, pwd, name, birthday, address, now, now);
		UserDB db = new UserDB();
		
		boolean isSuccess = db.insertDB(user);
		if (isSuccess) {
			model.addAttribute("mg", "Data Entry Successful");
		} else {
			model.addAttribute("mg", "Data Entry error");
		}		
		return "message";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String listMethod(Locale locale, Model model) {
		UserDB db = new UserDB();
		String htmlString = db.selectDB();
		model.addAttribute("list", htmlString);
		return "list";
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(Locale locale, Model model, @RequestParam("idx") int idx) {
		UserDB db = new UserDB();
		User selectUser = db.detailsDB(idx);

		if (selectUser != null) {
			model.addAttribute("idx", selectUser.idx);
			model.addAttribute("user_id", selectUser.id);
			model.addAttribute("user_pwd", selectUser.pwd);
			model.addAttribute("user_name", selectUser.name);
			model.addAttribute("user_birthday", selectUser.birthday);
			model.addAttribute("user_address", selectUser.address);
		}
		return "update";
	}
//	@RequestMapping(value = "/update_action", method = RequestMethod.GET)
//	public String updateAction(Locale locale, Model model
//			, @RequestParam("idx") int idx
//			, @RequestParam("user_id") String id
//			, @RequestParam("user_pwd") String pwd
//			, @RequestParam("user_name") String name
//			, @RequestParam("user_birthday") String birthday
//			, @RequestParam("user_address") String address) {
//		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		String now = sdf.format(Calendar.getInstance().getTime());
//				
//		User user = new User (id, pwd, name, birthday, address, now);
//		UserDB db = new UserDB();
//
//		boolean isSuccess = db.updateDB(user);
//		if (isSuccess) {
//			model.addAttribute("mg", "Data change Successful");
//		} else {
//			model.addAttribute("mg", "Data change error");
//		}		
//		return "message";
//	}
	
	@RequestMapping(value = "/update_action", method = RequestMethod.GET)
	public String updateAction(Locale locale, Model model
			, @RequestParam("idx") int idx
			, @RequestParam("user_id") String id
			, @RequestParam("user_pwd") String pwd
			, @RequestParam("user_name") String name
			, @RequestParam("user_birthday") String birthday
			, @RequestParam("user_address") String address) {
		UserDB db = new UserDB();
		
		db.updateDB(idx, name, pwd, name, birthday, address);

		model.addAttribute("mg", "User information has been modified");
		return "message";
	}
	
//	@RequestMapping(value = "/delete", method = RequestMethod.GET)
//	public String delete(Locale locale, Model model,  @RequestParam("idx") int idx) {
//		UserDB db = new UserDB();
//				
//		db.deleteData(idx);
//		model.addAttribute("mg", "Employee information has been deleted");
//		return "message";
//	}
//	
//	@RequestMapping(value = "/search", method = RequestMethod.GET)
//	public String search(Locale locale, Model model) {
//		
//		return "search";
//	}
//	
//	@RequestMapping(value = "/search_action", method = RequestMethod.GET)
//	public String searchAction(Locale locale, Model model
//			, @RequestParam("staff_name") String name) {
//		UserDB db = new UserDB();
//		String htmlString = db.searchData(name);
//		
//		model.addAttribute("list", htmlString);
//
//		return "list";
//	}
}
