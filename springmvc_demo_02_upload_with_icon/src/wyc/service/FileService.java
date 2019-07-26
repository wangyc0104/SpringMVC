package wyc.service;

import java.util.List;

import wyc.pojo.File;

/**
 * 文件相关Service
 * @author Yicheng Wang
 */
public interface FileService {

	/**
	 * 列举所有可下载文件
	 * @return
	 */
	public List<File> showFiles();
	
	/**
	 * 增加下载次数
	 * @param userName 
	 * @param id
	 * @param count
	 * @return
	 */
	public int addDownloadCounts(String userName, int id, int count);
	
}
