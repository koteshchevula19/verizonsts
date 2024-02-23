package com.springreactive;

public class Student {

	private String name;
	private Integer id;
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	public Student(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
}
