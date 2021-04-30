package server;

import user.User;

public class MyClassImp implements MyClass{
	
	public User doSome() {
		User u = new User();
		System.out.println("dosome 方法执行!");
		return u;
	}
	
	public User doSome(String name,int id) {
		User u = new User();
		System.out.println("dosome 方法执行!");
		System.out.println(u);
		return u;
	}
}
