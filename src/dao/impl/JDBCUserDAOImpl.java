/*
 * JDBCUserDAOImpl.java
 * Copyright: TsingSoft (c) 2015
 * Company: 北京清软创新科技有限公司
 */
package dao.impl;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import pojo.User;
import pojo.UserRowMapper;
import dao.UserDAO;

/**
 * jdbc实现的数据库访问
 * @author LT
 * @version 1.0, 2015年10月20日
 */
public class JDBCUserDAOImpl extends JdbcDaoSupport implements UserDAO{

	/**
	 * 查找对象
	 */
	@Override
	public User findByEmail(String email) {
		String sql = "select * from dn_ssh_user where email = ?";
		List<User> list = this.getJdbcTemplate().
				query(sql, new Object[]{email}, new UserRowMapper());
		if(null!=list&&list.size()!=0)
			return list.get(0);
		return null;
	}
	
}
