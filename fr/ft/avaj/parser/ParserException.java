package fr.ft.avaj.parser;

public class ParserException extends Exception{

	private static final long serialVersionUID = 1L;
	
	ParserException(String message){
		super(message);
	}

	ParserException(Exception e){
		super(e);
	}
}
