package com.abhinav.Hibernate_Fetching_Data_Demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="student_table")
public class Student {				//Bean or POJO
	
	@Id
	@Column
	private int id;
	
	@Column(name="student_name")
	private String name;
	
	//@Transient					//If we don't want to store color in database
	@Column
	private String color;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", color=" + color + "]";
	}
	
	

}
