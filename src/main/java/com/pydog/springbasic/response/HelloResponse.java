package com.pydog.springbasic.response;

public class HelloResponse {

	private String title;
	private String header;
	private String message;

	public HelloResponse() {
	}

	public HelloResponse(String title, String header, String message) {
		this.title = title;
		this.header = header;
		this.message = message;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
