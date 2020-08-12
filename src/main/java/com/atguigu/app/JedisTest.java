package com.atguigu.app;

import redis.clients.jedis.Jedis;

public class JedisTest {

    public static void main(String[] args) {

        //1.获取客户端对象
        Jedis jedis = new Jedis("hadoop202", 6379);

        //2.测试
        String ping = jedis.ping();
        System.out.println(ping);

        /*//String
        jedis.set("", "");
        jedis.get("");
        jedis.mset("", "");
        jedis.mget("", "", "");
        jedis.incr("");
        jedis.incrBy("", 0L);

        //List
        jedis.lpush("", "", "");
        jedis.rpush("", "", "");
        jedis.lrange("", 0, -1);
        jedis.lpop("");
        jedis.rpop("");

        //Set
        jedis.sadd("", "", "");
        jedis.smembers("");
        jedis.sismember("", "");

        //Hash
        jedis.hset("", "", "");
        jedis.hgetAll("");
        jedis.hget("", "");

        //ZSet
        jedis.zadd("", 0.0, "");*/

        //3.关闭连接
        jedis.close();

    }

}
