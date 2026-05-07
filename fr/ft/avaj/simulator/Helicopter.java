package fr.ft.avaj.simulator;

public class Helicopter extends Aircraft{
	protected String fullName;

	public Helicopter(long p_id, String p_name, Coordinates p_coordinate){
		super(p_id, p_name, p_coordinate);
		fullname = "Helicopter#"+p_name+"("+p_id+")";
	}

	public updateConditions(){
		String message;
		String oldWeather = weather;
		String weather = weatherTower.getWeather();

		int longitude = coordinate.getLongitude();
		int latitude = coordinate.getLatitude();
		int height = coordinate.getHeight();

		switch (weather){
			case "SUN":
				longitude += 10;
				height += 2;
				message = "What a sunny day!";
				break;
			case "RAIN":
				longitude += 5;
				message = "Drop, drop, drop";
				break;
			case "FOG":
				longitude  += 1;
				message = "Nothing to be seen here";
				break;
			case "SNOW":
				height -= 12;
				message = "Freezing cold be here";
				break;
			default:

		} 
	coordinate = new Coordinate(longitude, latitude, height);
	if (!weather.equals(old_weather)){
		System.out.println(full_name+": "+message);
	}
	if (coordinate.getHeight() == 0){
		System.out.println("Houston, we are landing")
		weatherTower.unregister();
	}
}
