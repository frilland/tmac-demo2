package com.example.tmacdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TmacDemoApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void hello() {
		System.out.println("-------------------- test helloword!");
	}
}
