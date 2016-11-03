package com.se.test.olinguo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.se.test.olinguo.domain.AnotherThing;
import com.se.test.olinguo.service.AnotherThingService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SeOlinugoTestApplicationTests {
	
	@Autowired
	private AnotherThingService anotherThingService;

	@Test
	public void contextLoads() {
		AnotherThing object = new AnotherThing();
		
		object.setText("prueba");
		
		anotherThingService.save(object);
		
		assertTrue(!anotherThingService.findAll().isEmpty());
	}

}
