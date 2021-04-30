package springlianxi;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import server.MyClass;
import server.imp.UserServerImp;
import user.User;

public class Testuser {
	
	@Test
	public void Test01() {
		String config = "application.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(config);
		
		user001.User u = (user001.User) ac.getBean("user111");
		
		System.out.println(u);
	}
	
	@Test
	public void Test02() {
		String config = "application.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(config);
		
		UserServerImp mc = (UserServerImp) ac.getBean("myUserServer");
		int result = mc.insertUser(new User(222,"asdas","gghh","qwe@123.com","男"));
		System.out.println(result);
		
	}
}
