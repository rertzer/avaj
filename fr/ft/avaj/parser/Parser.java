package fr.ft.avaj.parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import fr.ft.avaj.simulator.Simulator;
import fr.ft.avaj.simulator.SimulatorException;

public class Parser {
	private Simulator simulator;

	public Parser (Simulator p_simulator){
		simulator = p_simulator;
	}

	public void parse(String filename) throws ParserException, SimulatorException {
		try (BufferedReader reader = new BufferedReader(new FileReader(filename))){
				String line;
				if ((line = reader.readLine()) != null){
					simulator.setTurns(parseNumber(line));
				}
				while ((line = reader.readLine()) != null){
					addAircraft(line);
				}
			}
			catch(IOException e){
				throw new ParserException("Error reading file: " + e.getMessage());
			}
	}

	public void addAircraft(String line) throws ParserException, SimulatorException {
		String[] items = extractItems(line);	
		int[] coord = extractCoordinates(items);	
		simulator.addAircraft(items[0], items[1], coord);
	}

	private String[] extractItems(String line) throws ParserException {
		String[] items = line.split("\\s+");
		if (items.length != 5){
			throw new ParserException("Invalid line: " + line);
		}
		return items;
	}

	private int[] extractCoordinates(String[] items) throws ParserException {
		int[] coord = new int[3];
		for (int i = 0; i < 3; ++i){
			coord[i] = parseNumber(items[i+2]);
		}
		return coord;
	}

	private int parseNumber(String item) throws ParserException {
		try {
			if (item.matches("\\d+")) {
				return Integer.parseInt(item);
			}
			throw new ParserException("Invalid number: " + item);
		}
		catch (NumberFormatException e){
			throw new ParserException("Invalid number: " + item);
		}
	}
}
