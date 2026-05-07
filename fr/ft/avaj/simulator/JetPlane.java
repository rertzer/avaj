package fr.ft.avaj.simulator;

public class JetPlane extends Aircraft{
	protected String fullName;

	public JetPlane(long p_id, String p_name, Coordinates p_coordinate){
		super(p_id, p_name, p_coordinate);
		fullname = "JetPlane#"+p_name+"("+p_id+")";
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
				latitude += 10;
				height += 2;
				message = "I get a sunburn!";
				break;
			case "RAIN":
				latitude += 5;
				message = "Time to shower.";
				break;
			case "FOG":
				latitude  += 1;
				message = "I'am blind!!";
				break;
			case "SNOW":
				height -= 7;
				message = "Gingle Bell, gingle bell.";
				break;
			default:

		} 
	coordinate = new Coordinate(longitude, latitude, height);
	if (!weather.equals(old_weather)){
		System.out.println(full_name+": "+message);
	}
	if (coordinate.getHeight() == 0){
		System.out.println("Houston, we are crashing!")
		weatherTower.unregister();
	}
}
