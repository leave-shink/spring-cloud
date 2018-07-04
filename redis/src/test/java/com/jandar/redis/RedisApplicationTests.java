package com.jandar.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    RedisDao redisDao;
    @Test
    public void testRedisDao(){
        redisDao.setKey("name","shink");
        redisDao.setKey("age","18");
        System.out.println(redisDao.getValue("name"));
        System.out.println(redisDao.getValue("age"));
    }

}
