package wyc.service;

import wyc.pojo.PageInfo;

/**
 * 员工信息Service
 * @author Yicheng Wang
 */
public interface EmpService {
	
	/**
	 * 展示雇员信息
	 * @param pageSize
	 * @param pageNumber
	 * @return
	 */
	PageInfo show(int pageSize,int pageNumber);
	
}
