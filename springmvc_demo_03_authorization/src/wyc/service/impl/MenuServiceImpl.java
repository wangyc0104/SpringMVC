package wyc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import wyc.mapper.MenuMapper;
import wyc.pojo.Menu;
import wyc.pojo.Role;
import wyc.service.MenuService;


/**
 * 菜单有关的Service实现类
 * @author Yicheng Wang
 */
@Service
public class MenuServiceImpl implements MenuService {

	@Resource
	MenuMapper menuMapper;
	
	@Override
	public List<Menu> showAllMenus() {
		return menuMapper.selectMenuByPid(0);
	}

	@Override
	public List<Menu> showMenusByRoles(List<Role> roleList) {
		return menuMapper.selectMenuByRoleList(roleList, 0);
	}

}
