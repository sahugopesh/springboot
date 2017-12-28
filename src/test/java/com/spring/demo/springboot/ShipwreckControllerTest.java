package com.spring.demo.springboot;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.spring.demo.springboot.controller.ShipwreckController;
import com.spring.demo.springboot.model.Shipwreck;
import com.spring.demo.springboot.repository.ShipwreckRepository;

public class ShipwreckControllerTest {

	@InjectMocks
	private ShipwreckController sc;
	
	@Mock
	private ShipwreckRepository srepo;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testShiwreckGet() {
		
		Shipwreck sw = new Shipwreck();
		sw.setId(1L);
		
		when(srepo.findOne(1L)).thenReturn(sw);
		
		Shipwreck wreck = sc.get(1L);
		//assertEquals(1L, wreck.getId().longValue());
		assertThat(wreck.getId(), is(1L));
	}
}
