package fr.ft.avaj.simulator;

public class Helicopter extends Aircraft{

	public Helicopter(long p_id, String p_name, Coordinates p_coordinates){
		super(p_id, p_name, p_coordinates);
		fullName = "Helicopter#"+p_name+"("+p_id+")";
	}

	public void updateConditions() throws SimulatorException {
		String message;

		String weather = weatherTower.getWeather(coordinates);
		Printer printer = Printer.getInstance();

		int longitude = coordinates.getLongitude();
		int latitude = coordinates.getLatitude();
		int height = coordinates.getHeight();

		switch (weather){
			case "SUN":
				longitude += 10;
				height += 2;
				message = "What a sunny day!";
				break;
			case "RAIN":
				longitude += 5;
				message = "Drop, drop, drop...";
				break;
			case "FOG":
				longitude  += 1;
				message = "Where are we?";
				break;
			case "SNOW":
				height -= 12;
				message = "Freezing cold by here.";
				break;
			default:
				throw new SimulatorException("Unknown weather!");

		} 
		coordinates = new Coordinates(longitude, latitude, height);
		printer.print(fullName+": "+message);
		if (coordinates.getHeight() == 0){
			printer.print(fullName+": Frankfurt, we are landing.");
			weatherTower.unregister(this);
		}
	}
}
