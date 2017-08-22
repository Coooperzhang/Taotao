package com.taotao.rest.dao;

public interface JedisClient {

	String get(String key);

	String set(String key, String value);

	String hget(String hkey, String key);

	long hset(String hkey, String key, String value);

	/**
	 * 将 key 中储存的数字值增一。 如果 key 不存在，那么 key 的值会先被初始化为 0 ，然后再执行 INCR 操作。
	 * 如果值包含错误的类型，或字符串类型的值不能表示为数字，那么返回一个错误。
	 * 
	 * @param key
	 * @return
	 */
	long incr(String key);

	/**
	 * 为key设置时间
	 * 
	 * @param key
	 * @param second
	 * @return
	 */
	long expire(String key, int second);

	/**
	 * 当 key 不存在时，返回 -2 。 当 key 存在但没有设置剩余生存时间时，返回 -1 。 否则，以秒为单位，返回 key 的剩余生存时间。
	 * 
	 * @param key
	 * @return
	 */
	long ttl(String key);

	long del(String key);

	long hdel(String hkey, String key);

}
