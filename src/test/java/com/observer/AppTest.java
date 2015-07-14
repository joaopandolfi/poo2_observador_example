package com.observer;

import org.junit.Before;
import org.junit.Test;

import com.model.Speedometer;
import com.obervers.AutomaticGearBox;
import com.obervers.SpeedMonitor;

import junit.framework.Assert;

public class AppTest{
	SpeedMonitor speedMonitor;
	Speedometer speedometer;
	AutomaticGearBox automaticGearbox;
	
	@Before
	public void before(){
		speedometer = new Speedometer();
		speedMonitor = new SpeedMonitor();
		automaticGearbox = new AutomaticGearBox();
	}
	
	@Test
	public void testSpeedMonitor(){
		speedometer.addObserver(speedMonitor);
		
		int contador = 0;
		while(contador <100){
			speedometer.setCurrentSpeed(contador);
			contador+=10;
		}
		Assert.assertEquals("ALTO: (80) ALTO: (90) ", speedMonitor.getMessages());
	}
	
	@Test
	public void testAutomaticGearBox(){
		speedometer.addObserver(automaticGearbox);
		
		int contador = 0;
		while(contador < 50){
			speedometer.setCurrentSpeed(contador);
			contador+=10;
		}

		Assert.assertEquals("Marcha 1 Marcha 2 Marcha 3 Marcha 4 Marcha 4", automaticGearbox.getMessages());
	}
}
