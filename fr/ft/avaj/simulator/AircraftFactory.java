package fr.ft.avaj.simulator

public class AircraftFactory{
	private static int nextId = 0;
	private static AircraftFactory factory = new AircraftFactory;

	private AircraftFactory();

	public AircraftFactory getInstance(){
		return factory;
	}

	public Flyable newAircraft(String p_type, String p_name, Coordinates p_coordinates) throws SimulatorException{
		Flyable aircraft;
		switch (p_type){
			case "Helicopter":
				aircraft = new Helicopter(nextId, p_name, p_coordinates);
				break;
			case "JetPlane":
				aircraft = new JetPlane(nextId, p_name, p_coordinates);
				break;
			case "Balloon":
				aircraft = mew Balloon(nextId, p_name, p_coordinates);
				break;
			default:
				throw new SimulatorException("Unidentified Flying Object detected");

		}
		++nextId;
		return aircraft
	}

}
