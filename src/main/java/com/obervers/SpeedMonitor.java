package com.obervers;

import com.model.Observable;
import com.model.Observer;
import com.model.Speedometer;

public class SpeedMonitor implements Observer{
	public static final int SPEED_TO_ALERT = 70;
	private String messages = "";
	
	public void update(Observable obs){
		Speedometer speedo = (Speedometer) obs;
		if(speedo.getCurrentSpeed() > SPEED_TO_ALERT){
			messages +="ALTO: ("+speedo.getCurrentSpeed()+") ";
			//System.out.println("FILHO SE TA RAPIDO PA CARAI. ( "+speedo.getCurrentSpeed()+" )");
		} else {
			//System.out.println("Ta bom ainda . ( "+ speedo.getCurrentSpeed()+ " )");
		}
	}
	
	public String getMessages(){
		return messages;
	}
	
	public void flushMessages(){
		messages = "";
	}
}
