package fr.ft.avaj.simulator;

import java.io.PrintWriter;
import java.io.IOException;

public class Printer implements AutoCloseable {

	private static Printer printer;
	static {
        try {
            printer = new Printer();
        } catch (IOException e) {
            throw new RuntimeException("Cannot create Printer", e);
        }
    }

	private PrintWriter out;

	private Printer() throws IOException {
		out = new PrintWriter("simulation.txt");
	}

	public static Printer getInstance(){
		return printer;
	}

	public void print(String line){
		out.println(line);
		out.flush();
	}

	@Override
	public void close() {
		if (out != null){
			out.close();
		}
	}
}
