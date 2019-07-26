package wyc.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import wyc.pojo.Role;
import wyc.pojo.User;
import wyc.service.UserService;

import com.fasterxml.jackson.core.JsonProcessingException;

@Controller
public class UserController {

	@Resource
	UserService userServiceImpl;

	@RequestMapping("login")
	public String login(String username, String password, HttpServletRequest req) {
		User user = userServiceImpl.login(username, password);
		// ///////////////////////////////////////////////
		// System.out.println("login的用户为：" + user); //
		// //////////////////////////////////////////////
		if (user == null) {
			return "redirect:/index.jsp";
		} else {
			req.getSession().setAttribute("user", user);
			return "redirect:/role";
		}
	}
	
	@RequestMapping("role")
	public String getRoles(HttpServletRequest req) throws JsonProcessingException {
		User user = (User) req.getSession().getAttribute("user");
		List<Role> roleList = userServiceImpl.getRoles(user);
		req.getSession().setAttribute("roleList", roleList);
		// //////////////////////////////////////////////////
		// System.out.println("role的列表为：" + roleList); //
		// /////////////////////////////////////////////////
		return "redirect:/menu.jsp";
	}
	
}
