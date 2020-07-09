package by.epam.lobanok.lab1.appliance;

import java.util.ArrayList;
import by.epam.lobanok.lab1.action.GetterParameters;


public class Speakers extends Appliance{
	
	int powerConsumption;
	int numberOfSpeakers;
	String frequencyRange;
	double cordLength;
	

	public Speakers(String str) {
		GetterParameters getter = new GetterParameters();
		ArrayList<String> parameters = getter.getParameters(str);
		
		this.powerConsumption = Integer.parseInt(parameters.get(0));
		this.numberOfSpeakers = Integer.parseInt(parameters.get(1));
		this.frequencyRange = parameters.get(2);	
		this.cordLength = Double.parseDouble(parameters.get(3));		
	}
	
	
	public String toString() {
		return "Speakers [powerConsumption=" + powerConsumption + ", numberOfSpeakers=" + numberOfSpeakers
				+ ", frequencyRange=" + frequencyRange + ", cordLength=" + cordLength + "]";
	}
	
}
