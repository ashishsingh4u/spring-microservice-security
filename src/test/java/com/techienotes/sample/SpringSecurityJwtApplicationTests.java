package com.techienotes.sample;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringSecurityJwtApplicationTests {

	@BeforeClass
	public static void setup() {
		System.setProperty("jwt.secret.key", "dummy_key");
	}

	@Test
	public void contextLoads() {
	}
}
