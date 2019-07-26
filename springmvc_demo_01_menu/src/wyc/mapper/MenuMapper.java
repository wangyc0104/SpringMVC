package wyc.mapper;

import java.util.List;

import wyc.pojo.Menu;

/**
 * 菜单Mapper
 * @author Yicheng Wang
 */
public interface MenuMapper {
	
	/**
	 * 根据[父菜单的id]查找[菜单id列表]
	 * @param pid 父菜单id
	 * @return Menu的List
	 */
	public List<Menu> selectMenuByPid(int pid);
	
}
