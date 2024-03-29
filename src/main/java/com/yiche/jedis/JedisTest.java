package com.yiche.jedis;

import redis.clients.jedis.Jedis;

public class JedisTest {
    public static void main(String[] args) {
        // 构造jedis对象
        Jedis jedis = new Jedis("192.168.199.228", 6379);
        // 向redis中添加数据
        jedis.set("mytest", "123");
        // 从redis中读取数据
        String value = jedis.get("mytest");

        System.out.println(value);
        // 关闭连接
        jedis.close();
    }
}
