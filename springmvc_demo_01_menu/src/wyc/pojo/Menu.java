package wyc.pojo;

import java.util.List;

/**
 * 菜单类
 * @author Yicheng Wang
 */
public class Menu {

	private int id;
	private String name;
	private int pid;
	private List<Menu> childMenuList;

	public Menu() {
		super();
	}

	public Menu(int id, String name, int pid, List<Menu> childMenuList) {
		super();
		this.id = id;
		this.name = name;
		this.pid = pid;
		this.childMenuList = childMenuList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public List<Menu> getChildMenuList() {
		return childMenuList;
	}

	public void setChildMenuList(List<Menu> childMenuList) {
		this.childMenuList = childMenuList;
	}

	@Override
	public String toString() {
		return "Menu [id=" + id + ", name=" + name + ", pid=" + pid + ", childMenuList=" + childMenuList + "]";
	}

}
