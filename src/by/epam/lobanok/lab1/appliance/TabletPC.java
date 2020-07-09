package by.epam.lobanok.lab1.appliance;

import java.util.ArrayList;
import by.epam.lobanok.lab1.action.GetterParameters;


public class TabletPC extends Appliance{
	
	double batteryCapacity;
	double displayInch;
	int memoryROM;
	int flashMemoryCapacity;
	String color;

	
	public TabletPC(String str) {
		GetterParameters getter = new GetterParameters();
		ArrayList<String> parameters = getter.getParameters(str);
		
		this.batteryCapacity = Double.parseDouble(parameters.get(0));
		this.displayInch = Double.parseDouble(parameters.get(1));
		this.memoryROM = Integer.parseInt(parameters.get(2));
		this.flashMemoryCapacity = Integer.parseInt(parameters.get(3));
		this.color = parameters.get(4);
	}

	
	public String toString() {
		return "TabletPC [batteryCapacity=" + batteryCapacity + ", diplayInch=" + displayInch + ", memoryROM="
				+ memoryROM + ", flashMemoryCapacity=" + flashMemoryCapacity + ", color=" + color + "]";
	}
		
}
