package com.ssm.dao;

import com.ssm.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ProjectName: ssmDemo
 * @Package: com.ssm.dao
 * @ClassName: UserDao
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2018/12/13 16:13
 * @Version: 1.0
 */
@Repository(value = "UserDao")
public interface UserDao {
	/**
	* @Author LiuFei
	* @Description  查询所有用户数
	* @Date 16:31 2018/12/13
	* @Param []
	* @return int
	**/
	public int  findCount();
	/**
	* @Author LiuFei
	* @Description 查询所有用户信息
	* @Date 16:32 2018/12/13
	* @Param []
	* @return java.util.List<com.ssm.bean.User>
	**/
	public List<User>findAllInfor();
	/**
	* @Author LiuFei
	* @Description 根据id删除信息
	* @Date 16:46 2018/12/17
	* @Param [id]
	* @return int
	**/
	public int deleInfor(int id);
}
