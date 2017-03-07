/*
 * HibernateUserDAOImpl.java
 * Copyright: TsingSoft (c) 2015
 * Company: 北京清软创新科技有限公司
 */
package dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import pojo.User;
import dao.UserDAO;

/**
 * hibernate 的实现
 * @author LT
 * @version 1.0, 2015年10月20日
 */
public class HibernateUserDAOImpl extends HibernateDaoSupport implements UserDAO{
	
	/**
	 * 根据email查询对象
	 */
	@SuppressWarnings("unchecked")
	@Override 
	public User findByEmail(String email) {
		String hql = "from User where email = ?";
		List<User> list = this.getHibernateTemplate().find(hql,new Object[]{email} );
		if(null!=list&&list.size()!=0)
			return list.get(0);
		return null;
	}
}

