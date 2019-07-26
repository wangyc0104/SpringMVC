package wyc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import wyc.pojo.Role;
import wyc.pojo.User;

public interface UserMapper {

	/**
	 * 根据用户名和密码查询用户
	 * @param username
	 * @param password
	 * @return
	 */
	public User selByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

	/**
	 * 根据某用户查找其所有角色，以List&lt;Role&gt;形式返回
	 * @param user 用户对象
	 * @return 角色对象的List，如果没有任何角色则返回一个空的List
	 */
	public List<Role> selRoleListByUser(User user);


}
