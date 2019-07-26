package wyc.pojo;

/**
 * 用户类
 * @author Yicheng Wang
 */
public class User {
	private int id;
	private String username;
	private String password;
	private String icon;

	public User() {
		super();
	}

	public User(int id, String username, String password, String icon) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.icon = icon;
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

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", icon=" + icon + "]";
	}

}
