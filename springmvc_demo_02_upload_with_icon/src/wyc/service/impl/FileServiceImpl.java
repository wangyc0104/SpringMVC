package wyc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import wyc.mapper.FileMapper;
import wyc.pojo.File;
import wyc.service.FileService;

@Service
public class FileServiceImpl implements FileService {

	@Resource
	FileMapper fileMapper;

	@Override
	public List<File> showFiles() {
		return fileMapper.selAll();
	}

	@Override
	public int addDownloadCounts(String userName, int id, int count) {
		Logger logger = Logger.getLogger(FileServiceImpl.class);
		logger.info(userName + "下载了文件" + id + "！");
		return fileMapper.downloadCountsPlus(id, count);
	}

}
