package by.epam.lobanok.lab1;

public class Laptop extends Appliance{
	
	double batteryCapacity;
	String OS;
	int memoryROM;
	int systemMemory;
	double SPU;
	double displayInch;
	
	public Laptop(String str) {
		int start;
		int end;
		start = str.indexOf("=");
		end = str.indexOf(",");
		this.batteryCapacity = Double.parseDouble(str.substring(start + 1, end));
		
		start = str.indexOf("=",end + 1);
		end = str.indexOf(",", end + 1);
		this.OS = str.substring(start + 1, end);
		
		start = str.indexOf("=",end + 1);
		end = str.indexOf(",", end + 1);
		this.memoryROM = Integer.parseInt(str.substring(start + 1, end));
		
		start = str.indexOf("=",end + 1);
		end = str.indexOf(",", end + 1);
		this.systemMemory = Integer.parseInt(str.substring(start + 1, end));
		
		start = str.indexOf("=",end + 1);
		end = str.indexOf(",", end + 1);
		this.SPU = Double.parseDouble(str.substring(start + 1, end));
		
		start = str.indexOf("=",end + 1);
		end = str.length();
		this.displayInch = Double.parseDouble(str.substring(start + 1, end));
	}


	public String toString() {
		return "Laptop [batteryCapacity=" + batteryCapacity + ", OS=" + OS + ", memoryROM=" + memoryROM
				+ ", systemMemory=" + systemMemory + ", SPU=" + SPU + ", displayInch=" + displayInch + "]";
	}
	
	

}
