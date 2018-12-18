package com.ssm.dao;

import com.ssm.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * @ProjectName: ssmDemo
 * @Package: com.ssm.dao
 * @ClassName: UserDaoTest
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2018/12/13 16:37
 * @Version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application.xml"})
public class UserDaoTest {
	@Resource
	private UserDao dao;
	@Test
	public void findCount() {
		System.out.println(dao.findCount());
	}

	@Test
	public void findAllInfor() {

	}
}