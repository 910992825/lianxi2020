package server;

import java.util.List;

import user.User;

public interface UserServer {
	
	public List<User> selectUsers();
	
	public int insertUser(User u);
}
