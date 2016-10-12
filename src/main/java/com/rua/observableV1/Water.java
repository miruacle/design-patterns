package com.rua.observableV1;

public class Water {

	private Person person;
	private boolean isBoilded;
	
	public Water(){
		isBoilded = false;
	}
	
	public void setBoilded(){
		isBoilded = true;
		notifyObserver();
	}
	
	public void addObserver(Person person){
		this.person = person;
	}

	public void removeObserver(){
		if(person != null)
			person = null;
	}
	
	public void notifyObserver() {
		if(isBoilded && person != null){
			person.update("The water is boiled,");
			isBoilded = false;
		}	
	}
	
}
