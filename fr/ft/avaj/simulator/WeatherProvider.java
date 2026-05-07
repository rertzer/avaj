package fr.ft.avaj.simulator;

public class WeatherProvider{
	private static String[] weather = {"RAIN", "FOG", "SUN", "SNOW"};
	private static WeatherProvider provider = new WeatherProvider();
	private static int round = 1;

	private WeatherProvider(){};

	public WeatherProvider getInstance(){
		return provider;
	}

	public void changeWeather(){
		++round;
	}

	public String getCurrentWeather(Coordinates p_coordinate){
		int index = ((p_coordinate.getLongitude() + round) * (p_coordinate.getLatitude() + round) * (p_coordinate.getHeight()+ round)) % 4;
		return weather[index]; 
	}
}
