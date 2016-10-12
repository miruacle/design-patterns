package com.rua.observableV2;

public class App {

	public static void main(String[] args) {
		TemperatureObserver temperatureObserver = new TemperatureObserver();
		BoildedObserver boildedObserver = new BoildedObserver("Stop it");
		Water water = new Water(temperatureObserver);
		water.addObserver(boildedObserver);
		water.changed(45);
		water.changed(80);
		water.changed(100);
	}

}
