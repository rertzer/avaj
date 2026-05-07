package fr.ft.avaj.simulator;

public class Balloon extends Aircraft{
	protected String fullName;

	public Balloon(long p_id, String p_name, Coordinates p_coordinate){
		super(p_id, p_name, p_coordinate);
		fullname = "Balloon#"+p_name+"("+p_id+")";
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
				longitude += 2;
				height += 4;
				message = "I'm getting altitude sickness.";
				break;
			case "RAIN":
				height -= 5;
				message = "Phileas, would you fill the teapot.";
				break;
			case "FOG":
				height  -= 3;
				message = "Do you see anything Phileas?";
				break;
			case "SNOW":
				height -= 15;
				message = "It seems we become a giant snowball!";
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
