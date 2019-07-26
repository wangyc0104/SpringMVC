package wyc.service;

import java.util.List;

import wyc.pojo.Menu;

/**
 * 菜单有关的Service类
 * @author Yicheng Wang
 */
public interface MenuService {
	
	/**
	 * 展示所有的菜单
	 * @return
	 */
	public List<Menu> showAllMenus();
	
}
