package fr.ft.avaj.parser;

public class ParserException extends Exception{

	private static final long serialVersionUID = 1L;

	ParserException(){
		super();
	}

	ParserException(String message){
		super(message);
	}

	ParserException(Throwable cause){
		super(cause);
	}

	ParserException(String message, Throwable cause){
		super(message, cause);
	}
}
