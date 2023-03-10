package com.example.demo.exceptionhandler;

import java.sql.Date;

public class MessageExceptionHandler {
	private java.util.Date timestamp;
	private Integer status;
	private String message;
	
	public MessageExceptionHandler(java.util.Date date, Integer status, String message) {
		super();
		this.timestamp = date;
		this.status = status;
		this.message = message;
	}


	public java.util.Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
