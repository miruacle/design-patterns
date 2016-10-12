package com.rua.observableV2;

public class BoildedObserver implements Observer {

	String doSomething;
	BoildedObserver(String doSomething){
		this.doSomething = doSomething;
	}
	public void update(Observable observable) {
		Water water = (Water)observable;
		if(water.getTemperatur() >= 100){
			System.out.println("Status:" + water.getStatus());
			System.out.println("Boild water" + doSomething);
		}

	}

}
