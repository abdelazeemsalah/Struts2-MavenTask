package com.test.srutsspringintegration;

public class HelloWorld {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String execute() {
        return "SUCCESS";
    }
}
