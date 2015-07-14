package com.observer;

import com.model.Speedometer;
import com.obervers.AutomaticGearBox;
import com.obervers.SpeedMonitor;
import com.view.View;

public class App{
    
	public static void main( String[] args ){
       View view = new View();
       AutomaticGearBox automaticGearBox =  new AutomaticGearBox();
       SpeedMonitor speedMonitor = new SpeedMonitor();
       
       Speedometer speedometer =  new Speedometer();
       
       speedometer.addObserver(automaticGearBox);
       speedometer.addObserver(speedMonitor);
       
       speedometer.setCurrentSpeed(20);
       
       view.showMessage(automaticGearBox.getMessages());
       view.showMessage(speedMonitor.getMessages());
    }
}
