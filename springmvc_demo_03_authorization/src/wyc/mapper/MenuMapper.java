package wyc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import wyc.pojo.Menu;
import wyc.pojo.Role;

public interface MenuMapper {
	
	/**
	 * 根据[父菜单的id]查找[菜单对象列表]
	 * @param pid 父菜单id
	 * @return Menu的List
	 */
	public List<Menu> selectMenuByPid(int pid);
	
	/**
	 * 根据[角色列表]查找[菜单对象列表]
	 * @param roleList 角色的id
	 * @return Menu的List
	 */
	public List<Menu> selectMenuByRoleList(@Param("roleList") List<Role> roleList, @Param("pid") int pid);
	
}
