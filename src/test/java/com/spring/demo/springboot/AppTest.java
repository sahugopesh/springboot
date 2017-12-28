package com.spring.demo.springboot;

import org.junit.Test;

import com.spring.demo.springboot.controller.HomeController;

import junit.framework.TestCase;

public class AppTest extends TestCase {
	
	@Test
	public void testApp() {
		
		HomeController hc = new HomeController();
		String result = hc.home();
		assertEquals(result, "Sia's app for spring boot");
	}

}
