package server.imp;

import java.util.List;

import dao.UserDao;
import server.UserServer;
import user.User;

public class UserServerImp implements UserServer{
	
	private UserDao dao = null;
	
	
	public UserServerImp() {
		super();
	}
	
	
	public UserServerImp(UserDao dao) {
		super();
		this.dao = dao;
	}

	
	public UserDao getDao() {
		return dao;
	}


	public void setDao(UserDao dao) {
		this.dao = dao;
	}


	@Override
	public List<User> selectUsers() {
		// TODO Auto-generated method stub
		return dao.selectUsers();
	}

	@Override
	public int insertUser(User u) {
		// TODO Auto-generated method stub
		return dao.insertUser(u);
	}
	
}
