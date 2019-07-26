package wyc.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import wyc.pojo.Menu;
import wyc.service.MenuService;

/**
 * 菜单控制器
 * @author Yicheng Wang
 */
@Controller
public class MenuController {

	@Resource
	MenuService menuServiceImpl;

	@RequestMapping("menu")
	@ResponseBody
	public List<Menu> menu(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println(menuServiceImpl.showAllMenus());
		return menuServiceImpl.showAllMenus();
	}

}
