package wyc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import wyc.pojo.Files;

/**
 * 文件Mapper
 * @author Yicheng Wang
 */
public interface FilesMapper {
	
	/**
	 * 查询所有文件
	 * @return
	 */
	@Select("select * from files")
	List<Files> selAll();

	/**
	 * 根据id更新文件下载数量
	 * @param id
	 * @return
	 */
	@Update("update files set count = count + 1 where id=#{0}")
	int updCountById(int id);
	
}
