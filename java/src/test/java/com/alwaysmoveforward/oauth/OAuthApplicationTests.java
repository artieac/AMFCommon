package com.alwaysmoveforward.oauth;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = com.alwaysmoveforward.oauth.OAuthApplication.class)
@WebAppConfiguration
public class OAuthApplicationTests {

	@Test
	public void contextLoads() {
	}

}
