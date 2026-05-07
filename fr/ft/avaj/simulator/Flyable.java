package fr.ft.avaj.simulator;


public class Flyable{
	protected WeatherTower weatherTower;
	protected String weather;

	public abstract void updateConditions();

	public void registerTower(WeatherTower p_tower){
		weatherTower = p_tower();
		weatherTower.register(this);
	}

}
