package com.rua.observableV2;

public class TemperatureObserver implements Observer {

	public void update(Observable observable) {
		Water water = (Water)observable;
		System.out.println("Temperature:" + water.getTemperatur() + "Status:" + water.getStatus());
		System.out.println("Temperature Observer is observing...");
	}

}
