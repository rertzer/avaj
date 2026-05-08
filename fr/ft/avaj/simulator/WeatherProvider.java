package fr.ft.avaj.simulator;

import java.util.Random;

public class WeatherProvider{
	private static String[] weather = {"RAIN", "FOG", "SUN", "SNOW"};
	private static WeatherProvider provider = new WeatherProvider();
	private Random random = new Random();
	private int round = 1;


	private WeatherProvider(){};

	public static WeatherProvider getInstance(){
		return provider;
	}

	public void changeWeather(){
		round = random.nextInt(4);
	}

	public String getCurrentWeather(Coordinates p_coordinate){
		int index = (p_coordinate.getLongitude() + p_coordinate.getLatitude() + p_coordinate.getHeight()+ round) % 4;
		return weather[index]; 
	}
}
