package com.jenkins.demo.MySprintBootApp2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

import com.jenkins.demo.MySprintBootApp2.MyAppController;

@SpringBootTest
class MySprintBootApp2ApplicationTests {

	@Autowired
	MyAppController myAppController;
	
	@Test
	void contextLoads() {
		assertNotNull(myAppController);
	}

	@Test
	void newsLoads() {
		assertNotNull(myAppController.getLatestNewsHeadLines());
	}
	
	@Test
	void testgetLatestNewsHeadLines() {
		assertEquals("Six Flags, Cedar Fair merge in huge theme park deal",myAppController.getLatestNewsHeadLines());
	}
	
}
