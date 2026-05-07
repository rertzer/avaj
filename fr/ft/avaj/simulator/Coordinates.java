package fr.ft.avaj.simulator;

public class Coordinates{

	private int longitude;
	private int latitude;
	private int height;

	default Coordinates(int p_longitude, int p_latitude, int p_height){
		if (p_longitude > 0){
			longitude = p_longitude;
		}
		if (p_latitude > 0){
			latitude = p_latitude;
		}
		if (p_height > 0){
			if (p_height > 100){
				height = 100;
			}
			else{
				height = p_height;
			}
		}
	}

	public int getLongitude(){
		return longitude;
	}

	public int getLatitude(){
		return latitude;
	}

	public int getHeight(){
		return height;
	}
}
