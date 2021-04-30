package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import domain.Question;

public interface QuestionDao {
			
	public int update(Question q);
	
	public int delete(@Param("id") int questionid);
	
	public int insert(Question q);

	public List<Question> selectall();
	
	public List<Question> selectRandom();


}
