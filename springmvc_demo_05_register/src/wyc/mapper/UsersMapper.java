package wyc.mapper;

import org.apache.ibatis.annotations.Insert;

import wyc.pojo.Users;

/**
 * 用户Mapper
 * @author Yicheng Wang
 */
public interface UsersMapper {
	
	/**
	 * 新增用户
	 * @param users
	 * @return
	 */
	@Insert("insert into users values (default,#{username},#{password},#{photo})")
	int insUsers(Users users);
	
}
