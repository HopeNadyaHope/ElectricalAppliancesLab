package by.epam.lobanok.lab1;

public class Refrigerator extends Appliance {
	int powerConsumption;
	double weight;
	double freezerCapacity;
	double overallCapacity;
	double height;
	double width;
	
	public Refrigerator(int powerConsumption, double weight, double freezerCapacity, double overallCapacity,
			double height, double width) {
		super();
		this.powerConsumption = powerConsumption;
		this.weight = weight;
		this.freezerCapacity = freezerCapacity;
		this.overallCapacity = overallCapacity;
		this.height = height;
		this.width = width;
	}
	
	public Refrigerator(String str) {
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
		this.freezerCapacity = Double.parseDouble(str.substring(start + 1, end));
		
		start = str.indexOf("=",end + 1);
		end = str.indexOf(",", end + 1);
		this.overallCapacity = Double.parseDouble(str.substring(start + 1, end));
		
		start = str.indexOf("=",end + 1);
		end = str.indexOf(",", end + 1);
		this.height = Double.parseDouble(str.substring(start + 1, end));
		
		start = str.indexOf("=",end + 1);
		end = str.length();
		this.width = Double.parseDouble(str.substring(start + 1, end));
	}

	public String toString() {
		return "Refrigerator [powerConsumption=" + powerConsumption + ", weight=" + weight + ", freezerCapacity="
				+ freezerCapacity + ", overallCapacity=" + overallCapacity + ", height=" + height + ", width=" + width
				+ "]";
	}
	
	

}
