package com.rua.observable;

import com.rua.observableV1.Person;
import com.rua.observableV1.Water;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Person person = new Person();
		Water water = new Water();
		water.addObserver(person);
		water.setBoilded();
	}
}
