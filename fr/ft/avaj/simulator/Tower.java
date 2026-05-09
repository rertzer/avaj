package fr.ft.avaj.simulator;

import java.util.List;
import java.util.ArrayList;

public class Tower{
	private List<Flyable> observers = new ArrayList<>();


	public void register(Flyable p_flyable){
		observers.add(p_flyable);
		Printer.getInstance().print("Tower says: " + p_flyable.toString() + " registered to weather tower.");
	}

	public void unregister(Flyable p_flyable){
		observers.remove(p_flyable);
		Printer.getInstance().print("Tower says: " + p_flyable.toString() + " unregistered from weather tower.");
	}

	protected void conditionChanged() throws SimulatorException{
		for (Flyable flyable: new ArrayList<>(observers)){
			flyable.updateConditions();
		}
	}
}
