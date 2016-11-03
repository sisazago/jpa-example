package com.se.test.olinguo.service;

import java.util.List;

import com.se.test.olinguo.domain.AnotherThing;

public interface AnotherThingService {
	
	List<AnotherThing> findAll ();
	
	AnotherThing findById (Long id);
	
	AnotherThing save (AnotherThing object);
	
	void delete (Long id);
	
	AnotherThing update (AnotherThing object);

}
