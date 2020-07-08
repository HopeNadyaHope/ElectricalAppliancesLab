package by.epam.lobanok.lab1;

public class TabletPC extends Appliance{
	double batteryCapacity;
	double displayInch;
	int memoryROM;
	int flashMemoryCapacity;
	String color;

	public TabletPC(String str) {
		int start;
		int end;
		start = str.indexOf("=");
		end = str.indexOf(",");
		this.batteryCapacity = Double.parseDouble(str.substring(start + 1, end));
		
		start = str.indexOf("=",end + 1);
		end = str.indexOf(",", end + 1);
		this.displayInch = Double.parseDouble(str.substring(start + 1, end));
		
		start = str.indexOf("=",end + 1);
		end = str.indexOf(",", end + 1);
		this.memoryROM = Integer.parseInt(str.substring(start + 1, end));
		
		start = str.indexOf("=",end + 1);
		end = str.indexOf(",", end + 1);
		this.flashMemoryCapacity = Integer.parseInt(str.substring(start + 1, end));
		
		start = str.indexOf("=",end + 1);
		end = str.length();
		this.color = str.substring(start + 1, end);

	}

	public String toString() {
		return "TabletPC [batteryCapacity=" + batteryCapacity + ", diplayInch=" + displayInch + ", memoryROM="
				+ memoryROM + ", flashMemoryCapacity=" + flashMemoryCapacity + ", color=" + color + "]";
	}
		

}
