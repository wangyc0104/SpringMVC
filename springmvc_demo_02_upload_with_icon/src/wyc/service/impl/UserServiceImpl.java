package wyc.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import wyc.mapper.UserMapper;
import wyc.pojo.User;
import wyc.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	UserMapper userMapper;
	
	@Override
	public int register(User user) {
		return userMapper.insByUser(user);
	}

}
