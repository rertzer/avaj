package fr.ft.avaj.simulator;

public abstract class Aircraft extends Flyable{
	protected long id;
	protected String name;
	protected Coordinates coordinates;

	public Aircraft(long p_id, String p_name, Coordinates p_coordinates){
		id = p_id;
		name = p_name;
		coordinates = p_coordinates;
	}
}
