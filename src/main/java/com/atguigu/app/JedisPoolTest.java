package com.atguigu.app;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class JedisPoolTest {

    public static void main(String[] args) {

        //1.创建一个连接池
        JedisPool jedisPool = new JedisPool("hadoop202", 6379);

        //2.从池子中获取一个连接
        Jedis jedis = jedisPool.getResource();

        //3.测试
        System.out.println(jedis.ping());

        //4.关闭
        jedisPool.close();

    }
}
