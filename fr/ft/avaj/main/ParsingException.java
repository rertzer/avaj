package fr.ft.avaj.simulator;

public class ParsingException extends Exception{
	ParsingException(String message){
		super(message);
	}

	ParsingException(Exception e){
		super(e);
	}
}
