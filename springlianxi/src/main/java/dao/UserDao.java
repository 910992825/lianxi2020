package dao;

import java.util.List;

import user.User;


public interface UserDao {
	
	public List<User> selectUsers();
	
	public int insertUser(User u);
}
