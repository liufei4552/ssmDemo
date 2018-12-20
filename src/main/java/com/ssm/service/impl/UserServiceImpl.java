package com.ssm.service.impl;

import com.ssm.bean.User;
import com.ssm.dao.UserDao;
import com.ssm.service.UserService;
import com.ssm.utils.Message.Message;
import com.ssm.utils.logUtils.LogUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ProjectName: ssmDemo
 * @Package: com.ssm.service.impl
 * @ClassName: UserServiceImpl
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2018/12/13 21:02
 * @Version: 1.0
 */
@Service(value = "UserServiceImpl")
@Transactional
public class UserServiceImpl implements UserService{
	@Resource
	private UserDao dao;

	@Override
	@Cacheable(value = "userCache",key = "'user/'+methodName")
	public int findCount() {
		return dao.findCount();
	}

	@Override
	@Cacheable(value = "userCache",key = "'user/'+methodName")
	public List<User> findAllInfor() {
		return dao.findAllInfor();
	}

	@Override
	@CacheEvict(value = "userCache",allEntries = true)
	public int deleInfor(int id) {
		try {
			return dao.deleInfor(id);
		} catch (Exception e) {
			throw new RuntimeException("用于异常捕捉.........");
		}
	}

	@Override
	public int login(User user) {
		try {
			dao.login(user);
			return Message.MESSAGE_SUCCESS;
		} catch (Exception e) {
			LogUtil.getSystemError("登录异常:"+e);
			return Message.MESSAGE_FAIL;
		}
	}
}
