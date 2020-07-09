package by.epam.lobanok.lab1.appliance;

import java.util.ArrayList;
import by.epam.lobanok.lab1.action.GetterParameters;


public class Refrigerator extends Appliance {
	
	int powerConsumption;
	double weight;
	double freezerCapacity;
	double overallCapacity;
	double height;
	double width;
	
	
	public Refrigerator(String str) {
		GetterParameters getter = new GetterParameters();
		ArrayList<String> parameters = getter.getParameters(str);
		
		this.powerConsumption = Integer.parseInt(parameters.get(0));
		this.weight = Double.parseDouble(parameters.get(1));
		this.freezerCapacity = Double.parseDouble(parameters.get(2));
		this.overallCapacity = Double.parseDouble(parameters.get(3));
		this.height = Double.parseDouble(parameters.get(4));
		this.width = Double.parseDouble(parameters.get(5));
	}

	
	public String toString() {
		return "Refrigerator [powerConsumption=" + powerConsumption + ", weight=" + weight + ", freezerCapacity="
				+ freezerCapacity + ", overallCapacity=" + overallCapacity + ", height=" + height + ", width=" + width
				+ "]";
	}
	
}
