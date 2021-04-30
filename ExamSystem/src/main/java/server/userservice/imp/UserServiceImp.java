package server.userservice.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import dao.QuestionDao;
import dao.UserDao;
import domain.User;
import server.userservice.UserService;

@Component("userService")
public class UserServiceImp implements UserService {
	@Autowired
	@Qualifier("userDao")
	private UserDao userDao;
	@Resource(name="questionDao")
	private QuestionDao questionDao;
	
	
	public UserServiceImp(UserDao userDao, QuestionDao questionDao) {
		super();
		this.userDao = userDao;
		this.questionDao = questionDao;
	}

	public UserServiceImp() {
		super();
	}

	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public QuestionDao getQuestionDao() {
		return questionDao;
	}

	public void setQuestionDao(QuestionDao questionDao) {
		this.questionDao = questionDao;
	}

	@Transactional
	@Override
	public List<User> selectName(String username) {
		// TODO Auto-generated method stub
		return userDao.selectName(username);
	}

	@Transactional
	@Override
	public List<User> selectYanZheng(String username, String userpassword) {
		// TODO Auto-generated method stub
		return userDao.selectYanZheng(username, userpassword);
	}

	@Transactional
	@Override
	public int update(String username, String userpassword) {
		// TODO Auto-generated method stub
		return userDao.update(username, userpassword);
	}

	@Transactional
	@Override
	public int delete(String username) {
		// TODO Auto-generated method stub
		return userDao.delete(username);
	}

	@Transactional
	@Override
	public int insert(User u) {
		// TODO Auto-generated method stub
		return userDao.insert(u);
	}

	@Transactional
	@Override
	public List<User> selectAll() {
		// TODO Auto-generated method stub
		return userDao.selectAll();
	}

}
