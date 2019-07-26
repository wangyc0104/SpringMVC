package wyc.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import wyc.pojo.Menu;
import wyc.pojo.Role;
import wyc.service.MenuService;

@Controller
public class MenuController {

	@Resource
	MenuService menuServiceImpl;

	@SuppressWarnings("unchecked")
	@RequestMapping("menu")
	@ResponseBody
	/**
	 * 根据用户角色显示相应菜单项
	 * @param req
	 * @param resp
	 * @return
	 */
	public List<Menu> menu(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		List<Role> roleList = (List<Role>) req.getSession().getAttribute("roleList");
		List<Menu> menuList = menuServiceImpl.showMenusByRoles(roleList);
		// ///////////////////////////////////////////////////
		// System.out.println("menu的列表为：" + menuList); ///
		// //////////////////////////////////////////////////
		return menuList;
	}

}
