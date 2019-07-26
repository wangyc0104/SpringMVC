package wyc.service;

import wyc.pojo.User;

/**
 * 用户相关Service
 * @author Yicheng Wang
 */
public interface UserService {
	
	/**
	 * 注册用户
	 * @param user
	 * @return
	 */
	public int register(User user);
	
}
