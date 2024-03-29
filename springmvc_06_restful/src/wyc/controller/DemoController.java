package wyc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import wyc.pojo.Users;

/**
 * 测试控制器
 * @author Yicheng Wang
 */
@Controller
public class DemoController {
	
	/**
	 * RESTful风格
	 * @param page
	 * @return
	 */
	@RequestMapping("{page}")
	public String main(@PathVariable String page) {
		System.out.println("restful");
		return page;
	}

	@RequestMapping("login")
	public String login(Users users, HttpSession session) {
		if (users.getUsername().equals("admin") && users.getPassword().equals("123")) {
			session.setAttribute("users", users);
			return "main";
		} else {
			return "redirect:/login.jsp";
		}
	}
	
}
