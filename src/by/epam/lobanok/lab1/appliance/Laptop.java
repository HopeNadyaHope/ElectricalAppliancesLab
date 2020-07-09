package by.epam.lobanok.lab1.appliance;

import java.util.ArrayList;
import by.epam.lobanok.lab1.action.GetterParameters;


public class Laptop extends Appliance{
	
	double batteryCapacity;
	String OS;
	int memoryROM;
	int systemMemory;
	double SPU;
	double displayInch;
	
	
	public Laptop(String str) {
		GetterParameters getter = new GetterParameters();
		ArrayList<String> parameters = getter.getParameters(str);
		
		this.batteryCapacity = Double.parseDouble(parameters.get(0));
		this.OS = parameters.get(1);
		this.memoryROM = Integer.parseInt(parameters.get(2));
		this.systemMemory = Integer.parseInt(parameters.get(3));
		this.SPU = Double.parseDouble(parameters.get(4));
		this.displayInch = Double.parseDouble(parameters.get(5));
	}


	public String toString() {
		return "Laptop [batteryCapacity=" + batteryCapacity + ", OS=" + OS + ", memoryROM=" + memoryROM
				+ ", systemMemory=" + systemMemory + ", SPU=" + SPU + ", displayInch=" + displayInch + "]";
	}
	
}
