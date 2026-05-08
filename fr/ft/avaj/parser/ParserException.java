package fr.ft.avaj.parser;

public class ParserException extends Exception{
	ParserException(String message){
		super(message);
	}

	ParserException(Exception e){
		super(e);
	}
}
