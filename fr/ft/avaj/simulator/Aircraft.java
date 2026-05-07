package fr.ft.avaj.simulator;

public class Aircraft implements Flyable{
	protected long id;
	protected String name;
	protected Coordinate coordinates;

	public Aircraft(long p_id, string p_name, Coordinates p_coordinate){
		id = p_id;
		name = p_name;
		coordinates = p_coordinates;
	}
}
