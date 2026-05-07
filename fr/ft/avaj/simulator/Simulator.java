package fr.ft.avaj.simulator

public class Simulator(){
	private int times;
	private WeatherTower weathertower = new WeatherTower;
	private AircraftFactory aircraftFactory = AircraftFactory.getInstance();
	private WeatherProvider weatherProvider = WeatherProvider.getInstance(); 

	public Simulator(int p_times){
		times = p_times;
	}

	public addAircraft(String p_type, String p_name, Coordinates coordinates) {
		Flyable aircraft = AircraftFactory.newAircraft(items[0], items[1], coordinates);
		aircraft.registerTower(weathertower);
	}
}
