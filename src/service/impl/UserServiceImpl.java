package service.impl;

import pojo.User;
import dao.UserDAO;
import service.UserService;

public class UserServiceImpl implements UserService{
	//spring自动注入
	private UserDAO userDao; 
	
	@Override
	public boolean findUser(User user) {
		User u = userDao.findByEmail(user.getEmail());
		if(u!=null){
			if(u.getPassword().equals(user.getPassword()))
				return true;
		}
		return false;
	}

	public UserDAO getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}
	
	
}
