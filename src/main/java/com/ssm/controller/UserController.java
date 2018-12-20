package com.ssm.controller;

import com.ssm.bean.ResultBean;
import com.ssm.bean.User;
import com.ssm.service.UserService;
import com.ssm.utils.Message.Message;
import com.ssm.utils.logUtils.LogUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @ProjectName: ssmDemo
 * @Package: com.ssm.controller
 * @ClassName: UserController
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2018/12/20 16:32
 * @Version: 1.0
 */
@Controller
@RequestMapping(value = "user")
public class UserController {
	@Autowired
	private UserService service;
	/**
	* @Author LiuFei
	* @Description 用户登录
	* @Date 17:01 2018/12/20
	* @Param [request]
	* @return java.lang.String
	**/
	@RequestMapping("login")
	@ResponseBody
	public String login(HttpServletRequest request){
		ResultBean resultBean=new ResultBean();
		try {
			User user=new User();
			String username=request.getParameter("account");
			String password=request.getParameter("pass");
			user.setUsername(username);
			user.setPassword(password);
			int v=service.login(user);
			if(v== Message.MESSAGE_SUCCESS){
				return "index";
			}else if(v==Message.MESSAGE_FAIL){
				return "error";
			}else {
				return "";
			}
		} catch (Exception e) {
			LogUtil.getSystemError("登录异常:"+e);
			return "";
		}
	}
}
