package fr.ft.avaj.simulator;


public abstract class Flyable{
	protected WeatherTower weatherTower;
	protected String weather;

	public abstract void updateConditions() throws SimulatorException;

	public void registerTower(WeatherTower p_tower){
		weatherTower = p_tower;
		weatherTower.register(this);
	}

}
