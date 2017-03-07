/*
 * TestUserDAO.java
 * Copyright: TsingSoft (c) 2015
 * Company: 北京清软创新科技有限公司
 */
package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.User;
import dao.UserDAO;

/**
 * ceshi
 * @author LT
 * @version 1.0, 2015年10月20日
 */
public class TestM {
	
	@Test
	public void testUserDao(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("ssh.xml");
		UserDAO dao = (UserDAO) ac.getBean("userDao");
		User user = dao.findByEmail("admin");
		System.out.println("user类为："+user.getEmail()+"|"+user.getPassword());
	}
}
