package com.rua.observableV2;

public class Water extends Observable {

	private double temperature;
	private Status status;
	
	public enum Status { COLD, WARM, HOT, BOILED }
	public Water(){
		super();
		this.temperature = 0;
		this.status = Status.COLD;
	}
	
	public Water(Observer observer){
		this();
		observers.add(observer);
	}
	
	public double getTemperatur(){
		return temperature;
	}
	
	public Status getStatus(){
		return status;
	}
	
	public void changed(double temperature){
		this.temperature = temperature;
		if(temperature < 40){
			status = Status.COLD;
		}else if(temperature >= 40 && temperature < 60){
			status = Status.WARM;
		}else if(temperature >= 60 && temperature < 100){
			status = Status.HOT;
		}else {
			status = Status.BOILED;
		}
		this.isChanged = true;
		notifyObservers();
	}
}
