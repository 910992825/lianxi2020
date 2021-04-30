package controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import domain.Question;
import server.questionservice.QuestionService;
import server.userservice.UserService;

@Controller
public class QuestionController {
	
	@Resource(name="userService")
	private UserService us;
	@Resource(name="questionService")
	private QuestionService qs;
	
	@RequestMapping("/exam.do")
	public ModelAndView exam() {
		ModelAndView mv = new ModelAndView();
		
		List<Question> exam = qs.selectRandom();
		mv.addObject("exam", exam);
		mv.setViewName("exam.jsp");
		
		return mv;
	}
	
	@RequestMapping("/check.do")
	public ModelAndView check() {
		ModelAndView mv = new ModelAndView();
		
		return mv;
		
	}
	
	@RequestMapping("/questionadd.do")
	public String questionadd(Question q) {
		int result = qs.insert(q);
		
		if(result != 1) {
			return "questionadderror.jsp";
		}
		
		return "questionaddsuc.jsp";
	}
	
	@RequestMapping("/questiondelete.do")
	public String questiondelete(Question q) {
		
		int result = qs.delete(q.getQuestionid());
		
		if(result != 1) {
			return "questiondeleteerror.jsp";
		}
		
		return "questiondeletesuc";
	}
	
	@RequestMapping("/questionselect.do")
	public ModelAndView questionSelect() {
		ModelAndView mv = new ModelAndView();
		
		List<Question> allquestion = qs.selectall();
		mv.addObject("allquestion", allquestion);
		mv.setViewName("selectallquestion.jsp");
		
		return mv;
		
	}
}
