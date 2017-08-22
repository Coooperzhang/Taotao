package com.taotao.rest.jedis;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class JedisTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(JedisTest.class);

	@Test
	public void testJedisSingle() {
		// 创建一个Jedis对象
		Jedis jedis = new Jedis("127.0.0.1", 6379);
		// 调用jedis对象的方法，方法名称和redis的命令一致。
		jedis.set("lhr", "1001");
		String s = jedis.get("lhr");
		System.out.println("从Redis获得数据：" + s);
		// 关闭jedis
		jedis.close();
	}

	@Test
	public void testJdeisSingleSpring() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
		JedisPool pool = (JedisPool) ctx.getBean("redisClient");
		Jedis jedis = pool.getResource();
		String s = jedis.get("lhr");
		System.out.println("从Redis获得数据：" + s);
		// 关闭jedis
		jedis.close();
		pool.close();
	}
}
