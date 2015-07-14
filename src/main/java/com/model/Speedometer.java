package com.model;

public class Speedometer extends Observable{
	private int currentSpeed;
	
	public Speedometer(){
		currentSpeed = 0;
	}
	
	public void setCurrentSpeed(int speed){
		currentSpeed = speed;
		
		//Informa ao observador que foi modificado
		setChanged();
		notifyObservers();
	}
	
	public int getCurrentSpeed(){
		return currentSpeed;
	}
}
