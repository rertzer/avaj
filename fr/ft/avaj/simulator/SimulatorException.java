package fr.ft.avaj.simulator;

public class SimulatorException extends Exception{
	private static final long serialVersionUID = 1L;
	
	SimulatorException(){
		super();
	}
	SimulatorException(String message){
		super(message);
	}

	SimulatorException(Throwable cause){
		super(cause);
	}

	SimulatorException(String message, Throwable cause){
		super(message, cause);
	}
}
