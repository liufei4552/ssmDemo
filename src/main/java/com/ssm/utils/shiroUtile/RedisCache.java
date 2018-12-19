package com.ssm.utils.shiroUtile;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import org.apache.ibatis.cache.Cache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.jedis.JedisConnection;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;

import redis.clients.jedis.exceptions.JedisConnectionException;

/**
 * @Title RedisCache.java
 * @description:
 **/
public class RedisCache implements Cache {

	private static final Logger logger = LoggerFactory.getLogger(RedisCache.class);

	private static JedisConnectionFactory jedisConnectionFactory;

	private final String id;



	/**
	 * The {@code ReadWriteLock}.
	 */
	private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

	public RedisCache(final String id) {
		System.out.println(id);
		if (id == null) {
			logger.error("缓存实例编号为null");
			throw new IllegalArgumentException("Cache instances require an ID");
		}
		logger.info("MybatisRedisCache: Mybatis 缓存编号为 id=" + id);
		this.id = id;
	}

	@Override
	public void clear() {
		JedisConnection connection = null;
		try {
			connection = (JedisConnection) jedisConnectionFactory.getConnection();
			connection.flushDb();
			//connection.flushAll();
			logger.info("清空Redis内存数据库中的所有的数据");
		} catch (JedisConnectionException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				connection.close();
			}
		}
	}

	@Override
	public String getId() {
		return this.id;
	}

	@Override
	public Object getObject(Object key) {
		Object result = null;
		JedisConnection connection = null;
		try {
			connection = (JedisConnection) jedisConnectionFactory.getConnection();
			RedisSerializer<Object> serializer = new JdkSerializationRedisSerializer();
			result = serializer.deserialize(connection.get(serializer.serialize(key)));
			logger.info("从Redis内存数据库中取到Key:" + key + "的值");
		} catch (JedisConnectionException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				connection.close();
			}
		}
		return result;
	}

	@Override
	public ReadWriteLock getReadWriteLock() {
		return this.readWriteLock;
	}

	@Override
	public int getSize() {
		int result = 0;
		JedisConnection connection = null;
		try {
			connection = (JedisConnection) jedisConnectionFactory.getConnection();
			result = Integer.valueOf(connection.dbSize().toString());
		} catch (JedisConnectionException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				connection.close();
			}
		}
		return result;
	}

	@Override
	public void putObject(Object key, Object value) {
		JedisConnection connection = null;
		try {
			connection = (JedisConnection) jedisConnectionFactory.getConnection();
			RedisSerializer<Object> serializer = new JdkSerializationRedisSerializer();
			System.out.println("序列化后:" + serializer.serialize(key));
			connection.set(serializer.serialize(key), serializer.serialize(value));
			logger.info("存放到Redis内存数据库中的数据Key:" + key + ", value:" + value);
		} catch (JedisConnectionException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				connection.close();
			}
		}
	}

	@Override
	public Object removeObject(Object key) {
		JedisConnection connection = null;
		Object result = null;
		try {
			connection = (JedisConnection) jedisConnectionFactory.getConnection();
			RedisSerializer<Object> serializer = new JdkSerializationRedisSerializer();
			result = connection.expire(serializer.serialize(key), 0);
			logger.info("从Redis内存数据库中删除Key:" + key + "的数据");
		} catch (JedisConnectionException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				connection.close();
			}
		}
		return result;
	}

	public static void setJedisConnectionFactory(JedisConnectionFactory jedisConnectionFactory) {
		RedisCache.jedisConnectionFactory = jedisConnectionFactory;
	}
}
