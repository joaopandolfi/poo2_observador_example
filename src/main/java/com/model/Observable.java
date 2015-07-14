package com.model;

import java.util.ArrayList;

public class Observable {
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	private boolean changed = false;
	
	public void setChanged(){
		changed = true;
	}
	
	public void notifyObservers(){
		if(!changed)
			return;
		
		for(Observer observer: observers){
			observer.update(this);
		}
		
		changed = false;
	}
	
	public void addObserver(Observer observer){
		observers.add(observer);
	}
	
	public void removeObserver(Observer observer){
		observers.remove(observer);
	}
}
