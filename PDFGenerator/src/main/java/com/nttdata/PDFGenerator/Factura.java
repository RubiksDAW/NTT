package com.nttdata.PDFGenerator;

public class Factura {

	private String name;
	private String lastName;
	private int id;
	
	
	public Factura(String name, String lastName, int id) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.id = id;
	}
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getlastName() {
		return lastName;
	}
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
