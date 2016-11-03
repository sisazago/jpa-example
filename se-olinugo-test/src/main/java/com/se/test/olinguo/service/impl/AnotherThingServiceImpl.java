package com.se.test.olinguo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.se.test.olinguo.domain.AnotherThing;
import com.se.test.olinguo.repository.AnotherThingRepository;
import com.se.test.olinguo.service.AnotherThingService;

@Service
public class AnotherThingServiceImpl implements AnotherThingService {
	
	@Autowired
	private AnotherThingRepository anotherThingRepository;
	
	@Override
	public List<AnotherThing> findAll() {
		return (List<AnotherThing>) anotherThingRepository.findAll();
	}

	@Override
	public AnotherThing findById(Long id) {
		return anotherThingRepository.findOne(id);
	}

	@Override
	public AnotherThing save(AnotherThing object) {
		return anotherThingRepository.save(object);
	}

	@Override
	public void delete(Long id) {
		anotherThingRepository.delete(id);
	}

	@Override
	public AnotherThing update(AnotherThing object) {
		return anotherThingRepository.save(object);
	}

}
