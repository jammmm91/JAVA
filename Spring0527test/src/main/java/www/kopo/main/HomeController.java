package www.kopo.main;

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
		UserDB db = new UserDB();
		String htmlString = db.selectData();
		model.addAttribute("list", htmlString);
		return "list";
	}

	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insertMethod(Locale locale, Model model) {
		
		return "insert";
	}
	
	@RequestMapping(value = "/insert_action", method = RequestMethod.GET)
	public String insertAction(Locale locale, Model model
			, @RequestParam("staff_name") String name
			, @RequestParam("staff_sex") String sex
			, @RequestParam("staff_address") String address
			, @RequestParam("staff_department") String department) {
					
		UserDB db = new UserDB();
		db.insertData(name, sex, address, department);	
		model.addAttribute("mg", "직원정보가 DB에 저장되었습니다");
		
		return "message";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String updateMethod(Locale locale, Model model, @RequestParam("idx") int idx) {
		
		UserDB db = new UserDB();
		Staff selectStaff = db.detailsData(idx);

		if (selectStaff != null) {
			model.addAttribute("idx", selectStaff.idx);
			model.addAttribute("staff_name", selectStaff.name);
			model.addAttribute("staff_sex", selectStaff.sex);
			model.addAttribute("staff_address", selectStaff.address);
			model.addAttribute("staff_department", selectStaff.department);
		}
		return "update";
	}
	
	@RequestMapping(value = "/update_action", method = RequestMethod.GET)
	public String updateAction(Locale locale, Model model
			, @RequestParam("idx") int idx
			, @RequestParam("staff_name") String name
			, @RequestParam("staff_sex") String sex
			, @RequestParam("staff_address") String address
			, @RequestParam("staff_department") String department) {
		UserDB db = new UserDB();
		
		db.updateData(idx, name, sex, address, department);

		model.addAttribute("mg", "직원정보가 수정되었습니다.");
		return "message";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(Locale locale, Model model,  @RequestParam("idx") int idx) {
		UserDB db = new UserDB();
				
		db.deleteData(idx);
		model.addAttribute("mg", "직원정보가 삭제되었습니다");
		return "message";
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String create(Locale locale, Model model) {
		UserDB db = new UserDB();
		db.createTable();	
		model.addAttribute("mg", "직원정보 테이블이 생성되었습니다");
		return "message";
	}
	
	@RequestMapping(value = "/message", method = RequestMethod.GET)
	public String messageMethod(Locale locale, Model model) {
		return "message";
	}
}
