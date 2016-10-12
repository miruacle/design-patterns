package com.rua.observableV2;

import java.util.ArrayList;
import java.util.List;

abstract class Observable {

	protected boolean isChanged;
	protected List<Observer> observers = new ArrayList<Observer>();
	
	public Observable(){
		isChanged = false;
	}
	
	public void addObserver(Observer observer){
		observers.add(observer);
	}
	
	public void removeObserver(Observer observer){
		observers.remove(observer);
	}
	
	public void removeObservers(){
		observers.clear();
	}
	
	public void notifyObservers(){
		if(isChanged){
			for(Observer observer : observers)
				observer.update(this);
		}
		isChanged = false;
	}
}
