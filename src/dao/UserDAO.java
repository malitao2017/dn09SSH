/*
 * UserDAO.java
 * Copyright: TsingSoft (c) 2015
 * Company: 北京清软创新科技有限公司
 */
package dao;

import pojo.User;

/**
 * DAO层接口 
 * @author LT
 * @version 1.0, 2015年10月20日
 */
public interface UserDAO {
	public User findByEmail(String email);
}
