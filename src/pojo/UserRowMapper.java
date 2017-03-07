/*
 * UserRowMapper.java
 * Copyright: TsingSoft (c) 2015
 * Company: 北京清软创新科技有限公司
 */
package pojo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

/**
 * jdbc的spring接口支持
 * @author LT
 * @version 1.0, 2015年10月21日
 */
public class UserRowMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet resultset, int i) throws SQLException {
		User user = new User();
		user.setId(resultset.getInt("ID"));
		user.setEmail(resultset.getString("email"));
		user.setPassword(resultset.getString("password"));
		user.setDetails(resultset.getString("details"));
		return user;
	}

}
