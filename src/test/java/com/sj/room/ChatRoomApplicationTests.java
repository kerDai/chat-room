package com.sj.room;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChatRoomApplicationTests {

	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Test
	public void testAdd() {
		ValueOperations<String, String> opsValue = this.stringRedisTemplate.opsForValue();

		opsValue.set("a","ab");

		ListOperations<String, String> opsList = this.stringRedisTemplate.opsForList();


		opsList.leftPush("list", "first");
		opsList.leftPush("list", "second");
		opsList.leftPush("list", "third");

	}
}
