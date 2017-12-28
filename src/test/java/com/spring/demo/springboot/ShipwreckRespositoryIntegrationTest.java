package com.spring.demo.springboot;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.is;

import java.util.List;

import javax.servlet.annotation.WebInitParam;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.demo.springboot.model.Shipwreck;
import com.spring.demo.springboot.repository.ShipwreckRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ShipwreckRespositoryIntegrationTest {
	
	@Autowired
	private ShipwreckRepository shipwreckRepository;
	
	
	@Test
	public void testFindAll() {
		
		List<Shipwreck> wrecks =  shipwreckRepository.findAll();
		System.out.println(wrecks.size());
		assertThat(wrecks.size(), is(greaterThanOrEqualTo(4)));
		
	}
}
