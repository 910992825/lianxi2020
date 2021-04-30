package server.questionservice;

import java.util.List;

import domain.Question;

public interface QuestionService {
	
	public int update(Question q);
	
	public int delete(int questionid);
	
	public int insert(Question q);

	public List<Question> selectall();
	
	public List<Question> selectRandom();
}
