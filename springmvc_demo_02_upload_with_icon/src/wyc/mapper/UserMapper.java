package wyc.mapper;

import wyc.pojo.User;

/**
 * 用户相关mapper
 * @author Yicheng Wang
 */
public interface UserMapper {

	/**
	 * 根据用户名和密码查找用户
	 * @param username
	 * @param password
	 * @return 
	 * public User selByUsernameAndPassword(String username, String password);
	 */

	/**
	 * 新增用户
	 * @param user 要插入的用户对象
	 * @return 影响的数据库表行数
	 */
	public int insByUser(User user);
	
}
