package wyc.service;

import java.util.List;

import wyc.pojo.Menu;
import wyc.pojo.Role;

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
	
	/**
	 * 展示角色拥有的菜单
	 * @param roleList
	 * @return 角色拥有权限的菜单List
	 */
	public List<Menu> showMenusByRoles(List<Role> roleList);
}
