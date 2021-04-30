package com.niit.JavaHibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	int _id;
	String name;
	int sem;
	int average;
	
	
	public Student(int id, String name, int sem, int average) {
		super();
		this._id = id;
		this.name = name;
		this.sem = sem;
		this.average = average;
	}
	public int getId() {
		return _id;
	}
	public void setId(int id) {
		this._id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSemester() {
		return sem;
	}
	public void setSemester(int sem) {
		this.sem = sem;
	}
	public int getAverage() {
		return average;
	}
	public void setAverage(int average) {
		this.average = average;
	}
	
	

}