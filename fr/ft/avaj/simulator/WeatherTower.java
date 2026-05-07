package fr.ft.avaj.simulator;

public class WeatherTower extends Tower{
	private WeatherProvider weather = WeatherProvider.getInstance();

	public String getWeather(Coordinates p_coordinates){
		return weather.getCurrentWeather(p_coordinates);
	}

	public void changeWeather(){
		weather.changeWeather();
	}
}
