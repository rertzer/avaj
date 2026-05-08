package fr.ft.avaj.simulator;

public class WeatherTower extends Tower{

	public String getWeather(Coordinates p_coordinates){
		WeatherProvider weather = WeatherProvider.getInstance();
		return weather.getCurrentWeather(p_coordinates);
	}

	public void changeWeather(){
		WeatherProvider weather = WeatherProvider.getInstance();
		weather.changeWeather();
	}
}
