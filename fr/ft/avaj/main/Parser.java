package fr.ft.avaj.main;

import fr.ft.avaj.simulator.Simulator;
import ft.ft.avaj.simulator.Coordinates;


public class Parser {
	private Simulator simulator;

	public Parser (Simulator p_simulator){
		simulator = p_simulator;
	}
	
	public addAircraft(String line) throws ParsingException {
		 

		String[] items = line.split("\\s+");
		if (items.length != 5){
			throw ParsingException("Invalid line: " + line);
		}
		coordinates = extractCoordinates(String[] items);	
		simulator.addAircraft(item[0], item[1], coordinates);
	}

	private Coordinates extractCoordinates(String[] items) throws ParsingException {

		int longitude = parseNumber(items[2]);
		int latitude = parseNumber(items[3]);
		int height = parseNumber(items[4]);
		
		Coordinates coordinates = new Coordinates(longitude, latitude, height);
		return coordinates;
	}

	private int parseNumber(String item) throws ParsingException {
		try {
			if (s.matches("\\d+")) {
				return Integer.parseInt(item);
			}
			throw ParsingException("Invalid number: " + item);
		}
		catch (NumberFormatException e){
			throw ParsingException("Invalid number: " + item);
		}
	}
}
