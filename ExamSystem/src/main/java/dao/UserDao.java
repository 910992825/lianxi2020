package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import domain.User;

public interface UserDao {
	public List<User> selectName(@Param("name") String username);
	
	public List<User> selectYanZheng(@Param("name") String username,@Param("password") String userpassword);
	
	public int update(@Param("name") String username,@Param("password")String userpassword);
	
	public int delete(@Param("name") String username) ;
	
	public int insert(User u) ;

	public List<User> selectAll();
}
