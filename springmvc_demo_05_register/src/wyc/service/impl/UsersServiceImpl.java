package wyc.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import wyc.mapper.UsersMapper;
import wyc.pojo.Users;
import wyc.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {
	
	@Resource
	private UsersMapper usersMapper;

	@Override
	public int insRegister(Users users) {
		return usersMapper.insUsers(users);
	}

}
