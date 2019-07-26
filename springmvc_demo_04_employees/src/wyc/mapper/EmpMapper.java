package wyc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import wyc.pojo.Emp;

/**
 * 员工信息Mapper
 * @author Yicheng Wang
 */
public interface EmpMapper {
	
	/**
	 * 分页查询
	 * @param pageStart
	 * @param pageSize
	 * @return
	 */
	@Select("select  e.*,d.id `dept.id`,d.name `dept.name` from emp e LEFT JOIN dept d on e.deptid = d.id limit #{0},#{1}")
	List<Emp> selByPage(int pageStart, int pageSize);

	/**
	 * 数量查询
	 * @return
	 */
	@Select("select count(*) from emp")
	long selCount();
	
}
