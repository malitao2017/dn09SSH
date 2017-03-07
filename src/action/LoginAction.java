package action;

import pojo.User;
import service.UserService;

/**
 * 核心处理类
 * @author LT
 * @version 1.0, 2015年10月20日
 */
public class LoginAction {
	//表单自动封装
	private User user;
	
	private String msg;//提示信息
	
	//service层,第一种方案中，此类是交由spring管理的，第二种方案直接在配置文件中体现
	private UserService userService;
	
	//不配置的话的默认执行方法
	public String execute(){
		if(userService.findUser(user)){
			msg = user.getEmail();
			return "success";
		}
		msg = "用户名或密码错误";
		return "login";
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
