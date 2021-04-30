package server.questionservice.imp;

import java.util.List;

import dao.QuestionDao;
import dao.UserDao;
import domain.Question;
import server.questionservice.QuestionService;

public class QuestionServiceImp implements QuestionService {
	private UserDao userDao;
	private QuestionDao questionDao;
	
	public QuestionServiceImp() {
		super();
	}

	
	public QuestionServiceImp(UserDao userDao, QuestionDao questionDao) {
		super();
		this.userDao = userDao;
		this.questionDao = questionDao;
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


	@Override
	public int update(Question q) {
		// TODO Auto-generated method stub
		return questionDao.update(q);
	}

	@Override
	public int delete(int questionid) {
		// TODO Auto-generated method stub
		return questionDao.delete(questionid);
	}

	@Override
	public int insert(Question q) {
		// TODO Auto-generated method stub
		return questionDao.insert(q);
	}

	@Override
	public List<Question> selectall() {
		// TODO Auto-generated method stub
		return questionDao.selectall();
	}

	@Override
	public List<Question> selectRandom() {
		// TODO Auto-generated method stub
		return questionDao.selectRandom();
	}

}
