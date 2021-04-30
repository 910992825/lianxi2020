package user001;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("user111")
public class User {
	@Value("23")
	private int id ;
	@Value("shabi")
	private String name;
	public User() {
		System.out.println("无参构造方法执行！！！");
	}
	public User(int id, String name) {
		System.out.println("有参构造方法执行！！！");
		this.id = id;
		this.name = name;
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
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	
}
