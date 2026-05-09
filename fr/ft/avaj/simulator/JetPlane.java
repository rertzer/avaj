package fr.ft.avaj.simulator;

public class JetPlane extends Aircraft{

	public JetPlane(long p_id, String p_name, Coordinates p_coordinates) throws SimulatorException{
		super(p_id, p_name, p_coordinates);
	}

	@Override
	public String toString(){
		return "JetPlane#"+name+"("+id+")";
	}

	public void updateConditions() throws SimulatorException{
		String message;
		String weather = weatherTower.getWeather(coordinates);

		Printer printer = Printer.getInstance();

		int longitude = coordinates.getLongitude();
		int latitude = coordinates.getLatitude();
		int height = coordinates.getHeight();

		switch (weather){
			case "SUN":
				latitude += 10;
				height += 2;
				message = "And it burns, burns, burns...";
				break;
			case "RAIN":
				latitude += 5;
				message = "It's a rainy day!";
				break;
			case "FOG":
				latitude  += 1;
				message = "I feel like I'm clinging to a cloud.";
				break;
			case "SNOW":
				height -= 7;
				message = "Jingle bells, jingle bells!";
				break;
			default:
				throw new SimulatorException("Unknown weather!");

		} 
		coordinates = new Coordinates(longitude, latitude, height);
		printer.print(toString() + ": "+message);
		if (coordinates.getHeight() == 0){
			printer.print(toString() + ": Frankfurt, we are crashing!");
			weatherTower.unregister(this);
		}
	}
}
