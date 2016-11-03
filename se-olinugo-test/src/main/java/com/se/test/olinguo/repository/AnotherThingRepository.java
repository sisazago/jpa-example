package com.se.test.olinguo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.se.test.olinguo.domain.AnotherThing;

@Repository
public interface AnotherThingRepository extends CrudRepository<AnotherThing, Long> {
	
	AnotherThing findByTextEquals (String text);

}
