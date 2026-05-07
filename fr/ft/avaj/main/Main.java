package fr.ft.avaj.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import fr.ft.avaj.simulator.*;

public class Main{
	public static main(String[] args){
		if (args.length != 1){
			System.out.println("Usage: java fr.ft.avaj.main <filename>");
			return;
		}
		Simulator simul = new Simulator();	

		String filename = args[0];

			try (BufferedReader reader = new BufferedReader(new FileReader(filename))){
				String line;
				if ((line = reader.readLine()) != null){
				
 					simul = new Simulator();
			}
				while ((line = reader.readLine()) != null){}

			}
			catch(IOException e){
				System.out.println("Error reading file: " + e.getMessage());
			}
			catch(SimulatorException e){

				System.out.println("Simulation Error: " + e.getMessage());
		}
}
