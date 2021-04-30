package server.userservice;

import java.util.List;


import domain.User;

public interface UserService {
	public List<User> selectName(String username);
	
	public List<User> selectYanZheng(String username,String userpassword);
	
	public int update(String username,String userpassword);
	
	public int delete(String username) ;
	
	public int insert(User u) ;

	public List<User> selectAll();
}
