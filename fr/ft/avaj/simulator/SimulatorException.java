package fr.ft.avaj.simulator;

public class SimulatorException extends Exception{
	SimulatorException(String message){
		super(message);
	}

	SimulatorException(Exception e){
		super(e);
	}
}
