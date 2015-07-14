package com.obervers;

import com.model.Observable;
import com.model.Observer;
import com.model.Speedometer;

public class AutomaticGearBox implements Observer{
	private String message = "";
	
	public void update(Observable obs){
		Speedometer speedo = (Speedometer) obs;
		
		if(speedo.getCurrentSpeed() < 10){
			message +="Marcha 1 ";
		}
		else if(speedo.getCurrentSpeed()<20){
			message +="Marcha 2 ";
		}
		else if(speedo.getCurrentSpeed() < 30){
			message += "Marcha 3 ";
		}
		else{
			message +="Marcha 4 ";
		}
	}

	public String getMessages() {
		return message;
	}

	public void flushMessages() {
		message = "";
	}
}
