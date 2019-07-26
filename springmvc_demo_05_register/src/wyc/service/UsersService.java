package wyc.service;

import wyc.pojo.Users;

/**
 * 用户Service
 * @author Yicheng Wang
 */
public interface UsersService {
	
	/**
	 * 注册用户
	 * @param users
	 * @return
	 */
	int insRegister(Users users);
	
}
