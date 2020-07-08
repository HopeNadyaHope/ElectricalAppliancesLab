package by.epam.lobanok.lab1;

public class Speakers extends Appliance{
	int powerConsumption;
	int numberOfSpeakers;
	String frequencyRange;
	double cordLength;
	
	public Speakers(int powerConsumption, int numberOfSpeakers, String frequencyRange, double cordLength) {
		super();
		this.powerConsumption = powerConsumption;
		this.numberOfSpeakers = numberOfSpeakers;
		this.frequencyRange = frequencyRange;
		this.cordLength = cordLength;
	}

	public Speakers(String str) {
		int start;
		int end;
		start = str.indexOf("=");
		end = str.indexOf(",");
		this.powerConsumption = Integer.parseInt(str.substring(start + 1, end));
		
		start = str.indexOf("=",end + 1);
		end = str.indexOf(",", end + 1);
		this.numberOfSpeakers = Integer.parseInt(str.substring(start + 1, end));
		
		start = str.indexOf("=",end + 1);
		end = str.indexOf(",", end + 1);
		this.frequencyRange = str.substring(start + 1, end);	
		
		start = str.indexOf("=",end + 1);
		end = str.length();
		this.cordLength = Double.parseDouble(str.substring(start + 1, end));		
	}
	
	public String toString() {
		return "Speakers [powerConsumption=" + powerConsumption + ", numberOfSpeakers=" + numberOfSpeakers
				+ ", frequencyRange=" + frequencyRange + ", cordLength=" + cordLength + "]";
	}
	

}
