package com.springboootjdbcstarter.dto;

public class Laptop {

	String name;
	String manufacturer;
	@Override
	public String toString() {
		return "Laptop [name=" + name + ", manufacturer=" + manufacturer + "]";
	}
	public Laptop(String name, String manufacturer) {
		super();
		this.name = name;
		this.manufacturer = manufacturer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public Laptop() {
		// TODO Auto-generated constructor stub
	}
}
