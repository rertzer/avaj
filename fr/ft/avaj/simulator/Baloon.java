package fr.ft.avaj.simulator;

public class Baloon extends Aircraft{

	public Baloon(long p_id, String p_name, Coordinates p_coordinates){
		super(p_id, p_name, p_coordinates);
		fullName = "Baloon#"+p_name+"("+p_id+")";
	}

	public void updateConditions() throws SimulatorException{
		String message;
		String weather = weatherTower.getWeather(coordinates);

		int longitude = coordinates.getLongitude();
		int latitude = coordinates.getLatitude();
		int height = coordinates.getHeight();
		Printer printer = Printer.getInstance();

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
				message = "The baloon looks like a giant snowball!";
				break;
			default:
				throw new SimulatorException("Unknown weather!");

		} 
		coordinates = new Coordinates(longitude, latitude, height);
		printer.print(fullName+": "+message);
		if (coordinates.getHeight() == 0){
			printer.print(fullName+": Frankfurt, we have a nap.");
			weatherTower.unregister(this);
		}
	}
}
