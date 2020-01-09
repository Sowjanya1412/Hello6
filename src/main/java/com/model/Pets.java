package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pet")
public class Pets {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	 
	private String name;
	 
	private String place;
	 
	private int age;
	
	

	public Pets(String name, String place, int age, int id) {
		super();
		this.name = name;
		this.place = place;
		this.age = age;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int Id) {
		this.id = Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String Name) {
		this.name = Name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		place = place;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		age = age;
	}

	public Pets() {
		super();
	}

}
