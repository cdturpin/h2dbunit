package com.aci.demo.h2dbunit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.aci.demo.h2dbunit.config.SpringRootConfig;

@RunWith(SpringRunner.class)
@ComponentScan(basePackages = "com.aci.demo")
@SpringBootTest(classes = {H2dbunitApplication.class, SpringRootConfig.class})
@WebAppConfiguration
public class H2dbunitApplicationTests {
	
	@Test
	public void contextLoads() { //most basic test
	}

}
