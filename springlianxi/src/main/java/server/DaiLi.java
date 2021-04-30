package server;

import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

import user.User;

@Aspect
public class DaiLi {
	
	@AfterReturning(value="execution(* server.MyClassImp.doSome(..))",returning="ret")
	public void riZhi(JoinPoint jp ,Object ret) {
		System.out.println(new Date());
		
		System.out.println(jp.getSignature());
		System.out.println(jp.getTarget());
		Object[] obj = jp.getArgs();
		for(Object o : obj) {
			System.out.println(o);
		}
	}
}
