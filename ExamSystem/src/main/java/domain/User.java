package domain;

public class User {
	private int userid;
	private String username;
	private String userpassword;
	private String email;
	private String sex;
	
	public User() {
		
	}

	public User(int userid, String username, String userpassword, String email, String sex) {
		super();
		this.userid = userid;
		this.username = username;
		this.userpassword = userpassword;
		this.email = email;
		this.sex = sex;
	}
	
	
	
	public User(String username, String userpassword, String email, String sex) {
		super();
		this.username = username;
		this.userpassword = userpassword;
		this.email = email;
		this.sex = sex;
	}

	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", userpassword=" + userpassword + ", email="
				+ email + ", sex=" + sex + "]";
	}
	
	
}
