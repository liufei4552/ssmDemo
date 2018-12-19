package com.ssm.test;

import com.ssm.utils.shiroUtile.RedisCache;

/**
 * @ProjectName: ssmDemo
 * @Package: com.ssm.test
 * @ClassName: Test1
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2018/12/14 16:25
 * @Version: 1.0
 */
public class Test1 {
	public static void main(String[] args) {
		RedisCache redisCache=new RedisCache("123");
		redisCache.removeObject("user/findAllInfor");
	}
}
