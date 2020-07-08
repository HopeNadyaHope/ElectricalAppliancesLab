package by.epam.lobanok.lab1;

public class Oven extends Appliance{
	
	int powerConsumption;
	double weight;
	int capacity;
	double depth;
	double height;
	double width;

	public Oven(String str) {
		int start;
		int end;
		start = str.indexOf("=");
		end = str.indexOf(",");
		this.powerConsumption = Integer.parseInt(str.substring(start + 1, end));
		
		start = str.indexOf("=",end + 1);
		end = str.indexOf(",", end + 1);
		this.weight = Double.parseDouble(str.substring(start + 1, end));
		
		start = str.indexOf("=",end + 1);
		end = str.indexOf(",", end + 1);
		this.capacity = Integer.parseInt(str.substring(start + 1, end));
		
		start = str.indexOf("=",end + 1);
		end = str.indexOf(",", end + 1);
		this.depth = Double.parseDouble(str.substring(start + 1, end));	
		
		start = str.indexOf("=",end + 1);
		end = str.indexOf(",", end + 1);
		this.height = Double.parseDouble(str.substring(start + 1, end));
		
		start = str.indexOf("=",end + 1);
		end = str.length();
		this.width = Double.parseDouble(str.substring(start + 1, end));		
	}
	
	
	public String toString() {
		return "Oven [powerConsumption=" + powerConsumption + ", weight=" + weight + ", capacity=" + capacity
				+ ", depth=" + depth + ", height=" + height + ", width=" + width + "]";
	}
	
	
	

}
