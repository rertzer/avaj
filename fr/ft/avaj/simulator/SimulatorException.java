package fr.ft.avaj.simulator;

public class SimulatorException extends Exception{
	private static final long serialVersionUID = 1L;

	SimulatorException(String message){
		super(message);
	}

	SimulatorException(Exception e){
		super(e);
	}
}
