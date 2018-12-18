package com.ssm.utils.shiroUtile;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @ProjectName: ssmDemo
 * @Package: com.ssm.utils.shiroUtile
 * @ClassName: SerializeUtils
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2018/12/13 16:02
 * @Version: 1.0
 */
public class SerializeUtils {
	/**
	 * @Title: serialize
	 * @Description: 序列化
	 * @return byte[]
	 */
	public static byte[] serialize(Object object) {
		ObjectOutputStream oos = null;
		ByteArrayOutputStream baos = null;
		try {
			// 序列化
			baos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(baos);
			oos.writeObject(object);
			byte[] bytes = baos.toByteArray();
			return bytes;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * @Title: unserialize
	 * @Description: 反序列化
	 * @return Object
	 */
	public static Object unserialize(byte[] bytes) {
		if (bytes == null)
		{
			return null;
		}
		ByteArrayInputStream bais = null;
		try {
			// 反序列化
			bais = new ByteArrayInputStream(bytes);
			ObjectInputStream ois = new ObjectInputStream(bais);
			return ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
