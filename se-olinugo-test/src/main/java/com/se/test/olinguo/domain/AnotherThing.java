package com.se.test.olinguo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.domain.Persistable;

@Entity
public class AnotherThing implements Persistable<Long> {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(max = 100)
	private String text;

	@Override
	public Long getId() {
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}

	@Override
	public boolean isNew() {
		return (getId() == null);
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
