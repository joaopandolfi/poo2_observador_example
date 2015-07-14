package com.model;

public interface Observer {

	public void update(Observable obs);
	
	public String getMessages();
	public void flushMessages();
}
