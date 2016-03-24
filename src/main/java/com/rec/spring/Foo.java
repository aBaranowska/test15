package com.rec.spring;

public class Foo {

	private Service service;

	public void setMyService(Service service) {
		this.service = service;
	}

	public String getMessage() {
		return service.getMessage();
	}

}
