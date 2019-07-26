package wyc.service;

import java.util.List;

import wyc.pojo.Role;
import wyc.pojo.User;

public interface UserService {

	/**
	 * 用户登录
	 * @param username 用户名
	 * @param password 密码
	 * @return 若登录成功则返回相应User对象，若登录失败则返回null
	 */
	public User login(String username, String password);
	
	/**
	 * 获取某用户的角色
	 * @param user
	 * @return
	 */
	public List<Role> getRoles(User user);
	
}
