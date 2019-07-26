package wyc.pojo;

import java.util.List;

/**
 * 角色类
 * @author Yicheng Wang
 */
public class Role {

	private int id;
	private String name;
	private List<Menu> menuList;

	public Role() {
		super();
	}

	public Role(int id, String name, List<Menu> menuList) {
		super();
		this.id = id;
		this.name = name;
		this.menuList = menuList;
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

	public List<Menu> getMenuList() {
		return menuList;
	}

	public void setMenuList(List<Menu> menuList) {
		this.menuList = menuList;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", menuList=" + menuList + "]";
	}

}
