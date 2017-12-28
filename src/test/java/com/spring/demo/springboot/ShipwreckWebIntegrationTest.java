package com.spring.demo.springboot;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ShipwreckWebIntegrationTest {

	@Test
	public void testListAll() throws IOException {
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8080/api/v1/shipwrecks/1", String.class);
		
		assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
		
		ObjectMapper om = new ObjectMapper();
		JsonNode jn = om.readTree(response.getBody());
		
		assertThat( jn.isMissingNode(), is(false));
		assertThat( jn.toString().contains("id"), is(true));
		assertThat( jn.toString(), equalTo("{\"id\":1,\"name\":\"Titanic\",\"description\":\"Titanic biult in 1905\",\"condition\":\"New\",\"depth\":100,\"latitude\":12.334,\"longitude\":345.5,\"yearDiscovered\":1940}"));
		
		
	}
}
