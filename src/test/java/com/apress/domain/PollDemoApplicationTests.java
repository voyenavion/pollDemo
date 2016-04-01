package com.apress.domain;

import com.apress.PollDemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = PollDemoApplication.class)
@WebAppConfiguration
public class PollDemoApplicationTests {

	@Test
	public void contextLoads() {
	}

}
