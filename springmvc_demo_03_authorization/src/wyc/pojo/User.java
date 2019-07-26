package wyc.pojo;

import java.util.List;

/**
 * 用户类
 * @author Yicheng Wang
 */
public class User {

	private int id;
	private String username;
	private String password;
	private String name;
	private List<Role> roleList;

	public User() {
		super();
	}

	public User(int id, String username, String password, String name, List<Role> roleList) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.roleList = roleList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Role> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", name=" + name + ", roleList=" + roleList + "]";
	}

}
