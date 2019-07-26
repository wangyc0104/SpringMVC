package wyc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import wyc.pojo.File;

/**
 * 文件相关Mapper
 * @author Yicheng Wang
 */
public interface FileMapper {

	/**
	 * 查找所有文件
	 * @return
	 */
	public List<File> selAll();
	
	/**
	 * 增加下载次数
	 * @param id
	 * @param count
	 * @return
	 */
	public int downloadCountsPlus(@Param("id") int id, @Param("count") int count);
	
}
