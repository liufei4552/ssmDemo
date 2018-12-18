package com.ssm.service.impl;

import com.ssm.bean.User;
import com.ssm.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @ProjectName: ssmDemo
 * @Package: com.ssm.service.impl
 * @ClassName: UserServiceImplTest
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2018/12/14 15:47
 * @Version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application.xml"})
public class UserServiceImplTest {
	@Autowired
	private UserService service;
	@Test
	public void findCount() {
		System.out.println("用户个数:"+service.findCount());
	}

	@Test
	public void findAllInfor() {
		List<User>list=service.findAllInfor();
		for (User user : list) {
			System.out.println(user);
		}
	}
	@Test
	public void deleInfor(){
		System.out.println("删除用户信息:"+service.deleInfor(14));
	}
}