package wyc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import wyc.mapper.FilesMapper;
import wyc.pojo.Files;
import wyc.pojo.Users;
import wyc.service.FilesService;

@Service
public class FileServiceImpl implements FilesService {
	
	@Resource
	private FilesMapper filesMapper;

	@Override
	public List<Files> show() {
		return filesMapper.selAll();
	}

	@Override
	public int updCount(int id, Users users, String name) {
		Logger logger = Logger.getLogger(FileServiceImpl.class);
		logger.info(users.getUsername() + "下载了" + name);
		return filesMapper.updCountById(id);
	}

}
