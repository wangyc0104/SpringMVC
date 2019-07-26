package wyc.service;

import java.util.List;

import wyc.pojo.Files;
import wyc.pojo.Users;

/**
 * 文件Service
 * @author Yicheng Wang
 */
public interface FilesService {
	
	/**
	 * 显示全部
	 * @return
	 */
	List<Files> show();
	
	/**
	 * 根据id修改资料下载次数
	 * @param id
	 * @return
	 */
	int updCount(int id,Users users,String name);
	
}
