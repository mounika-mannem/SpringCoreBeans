package com.second.SpringCore2;

public class HelloBean {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void printHey() {
		System.out.println("Hey"+name);
	}

}
