package wyc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import wyc.mapper.UserMapper;
import wyc.pojo.Role;
import wyc.pojo.User;
import wyc.service.UserService;

/**
 * 用户服务实现类
 * @author Yicheng Wang
 */
@Service
public class UserServiceImpl implements UserService {

	@Resource
	UserMapper userMapper;

	@Override
	public User login(String username, String password) {
		return userMapper.selByUsernameAndPassword(username, password);
	}

	@Override
	public List<Role> getRoles(User user) {
		return userMapper.selRoleListByUser(user);
	}

}
