package fr.ft.avaj.main;

import fr.ft.avaj.parser.Parser;
import fr.ft.avaj.parser.ParserException;
import fr.ft.avaj.simulator.Simulator;
import fr.ft.avaj.simulator.SimulatorException;

public class Main{

	public static void main(String[] args){
		if (args.length != 1){
			System.out.println("Usage: java fr.ft.avaj.main <filename>");
			return;
		}

		try {
			Simulator simul = new Simulator();	
			Parser parser = new Parser(simul);
			parser.parse(args[0]);
			simul.run();
		}
		catch(ParserException | SimulatorException e){
			System.out.println("Avaj Error: " + e.getMessage());
		}
	}
}
