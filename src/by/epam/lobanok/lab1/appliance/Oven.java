package by.epam.lobanok.lab1.appliance;

import java.util.ArrayList;
import by.epam.lobanok.lab1.action.GetterParameters;


public class Oven extends Appliance{
	
	int powerConsumption;
	double weight;
	int capacity;
	double depth;
	double height;
	double width;

	
	public Oven(String str) {
		GetterParameters getter = new GetterParameters();
		ArrayList<String> parameters = getter.getParameters(str);
		
		this.powerConsumption = Integer.parseInt(parameters.get(0));
		this.weight = Double.parseDouble(parameters.get(1));
		this.capacity = Integer.parseInt(parameters.get(2));
		this.depth = Double.parseDouble(parameters.get(3));	
		this.height = Double.parseDouble(parameters.get(4));
		this.width = Double.parseDouble(parameters.get(5));		
	}
	
	
	public String toString() {
		return "Oven [powerConsumption=" + powerConsumption + ", weight=" + weight + ", capacity=" + capacity
				+ ", depth=" + depth + ", height=" + height + ", width=" + width + "]";
	}
	
}
