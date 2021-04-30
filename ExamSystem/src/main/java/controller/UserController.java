package controller;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import domain.User;
import server.questionservice.QuestionService;
import server.userservice.UserService;

@Controller
//@RequestMapping("/user")
public class UserController {
	
	@Resource(name="userService")
	private UserService us;
	@Resource(name="questionService")
	private QuestionService qs;
	
	@RequestMapping("/useradd.do")
	public ModelAndView useradd(User u) {
		
		ModelAndView mv = new ModelAndView();
		
		List<User> cunzai = us.selectName(u.getUsername());
		if(!cunzai.isEmpty()) {
			mv.setViewName("regerror.jsp");
			return mv;
		}
		us.insert(u);
		mv.setViewName("regscueecss.jsp");
		return mv;
	}
	
	@RequestMapping("/delete.do")
	public ModelAndView userDelete(User u) {
		ModelAndView mv = new ModelAndView();
		
		int result = us.delete(u.getUsername());
		
		if(result != 1) {
			mv.setViewName("deleteerror.jsp");
			return mv;
		}
		mv.setViewName("deletesuc.jsp");
		return mv;
	}
	
	@RequestMapping("/userlog.do")
	public ModelAndView userlog(User u) {
		ModelAndView mv = new ModelAndView();

		List<User> result = us.selectYanZheng(u.getUsername(), u.getUserpassword());
		if(result.isEmpty()) {
			mv.setViewName("logerror.html");
			return mv;
		}
		mv.setViewName("logsuc.html");
		return mv;
	}
	
	@RequestMapping("/userselect.do")
	public ModelAndView userselect() {
		ModelAndView mv = new ModelAndView();
		
		List<User> alluser = us.selectAll();
		
		mv.addObject("alluser", alluser);
		
		mv.setViewName("selectAllUser.jsp");

		return mv;
	}
	
	@RequestMapping("/userupdate.do")
	public ModelAndView userUpdate(User u,String userpassword2){
		ModelAndView mv = new ModelAndView();
		
		List<User> resultselect = us.selectYanZheng(u.getUsername(), u.getUserpassword());
		
		if (!resultselect.isEmpty()) {
			int result = us.update(u.getUsername(), userpassword2);
			if (result != 1) {
				mv.setViewName("updateerror.jsp");
				return mv;
			}
			mv.setViewName("updatesuc.jsp");
			return mv;
		}
		mv.setViewName("updateerror.jsp");
		return mv;
	}
}
