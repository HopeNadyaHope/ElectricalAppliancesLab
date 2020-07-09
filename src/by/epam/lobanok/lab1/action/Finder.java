package by.epam.lobanok.lab1.action;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class Finder {

	public ArrayList<String> findAppliances(String type, String characteristic, String value) throws Exception{
		File file = new File("appliances_db.txt");
    		Scanner in = new Scanner(file);    	
    		ArrayList<String> neededLines = new ArrayList<String>();
		String line;
		String characteristicAndValue;
		characteristicAndValue = characteristic + "=" + value;
		
		while(in.hasNextLine()) {
			line = in.nextLine();
			if( (line.contains(type)) && (line.contains(characteristicAndValue)) ) {
				neededLines.add(line);
			}
		}
    		in.close();
		return neededLines;
	}

}
