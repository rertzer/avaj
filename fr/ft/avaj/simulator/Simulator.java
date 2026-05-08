package fr.ft.avaj.simulator;

public class Simulator{
	private int turns;
	private WeatherTower weatherTower = new WeatherTower();
	private AircraftFactory aircraftFactory = AircraftFactory.getInstance();
	private WeatherProvider weatherProvider = WeatherProvider.getInstance(); 

	public void setTurns(int p_turns){

		turns = p_turns;
	}

	public void addAircraft(String type, String name, int[] coord) throws SimulatorException {
		Coordinates coordinates = new Coordinates(coord[0], coord[1], coord[2]);
		Flyable aircraft = aircraftFactory.newAircraft(type, name, coordinates);
		aircraft.registerTower(weatherTower);
	}

	public void run() throws SimulatorException{
		for (int i = 0; i < turns; ++i){
			weatherTower.changeWeather();
			weatherTower.conditionChanged();
		}
	}
}
