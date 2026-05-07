package fr.ft.avaj.simulator;

import java.util.List;
import java.util.ArrayList;

public class Tower{
	private List<Flyable> observers = new ArrayList<>;


	public void register(Flyable p_flyable){
		observers.add(p_flayable);
		System.out.println("Tower says: "+p_flyable.fullName+" registered to weather tower.");
	}

	public void unregister(Flyable p_flyable){
		observers.remove(p_flyable);
		System.out.println("Tower says: "+p_flyable.fullName+" unregistered from weather tower.");
	}

	protected void conditionChanged(){
		for (flyable: observers){
			flyable.updateCondition();
		}
	}
}
