package by.epam.lobanok.lab1;

public class VacuumCleaner extends Appliance {
	int powerConsumption;
	String filterType;
	String bagType;
	String wandType;
	int motorSpeedRegulation;
	double cleaningWidth;

	public VacuumCleaner(String str) {
		int start;
		int end;
		start = str.indexOf("=");
		end = str.indexOf(",");
		this.powerConsumption = Integer.parseInt(str.substring(start + 1, end));
		
		start = str.indexOf("=",end + 1);
		end = str.indexOf(",", end + 1);
		this.filterType = str.substring(start + 1, end);
		
		start = str.indexOf("=",end + 1);
		end = str.indexOf(",", end + 1);
		this.bagType = str.substring(start + 1, end);
		
		start = str.indexOf("=",end + 1);
		end = str.indexOf(",", end + 1);
		this.wandType = str.substring(start + 1, end);	
		
		start = str.indexOf("=",end + 1);
		end = str.indexOf(",", end + 1);
		this.motorSpeedRegulation = Integer.parseInt(str.substring(start + 1, end));
		
		start = str.indexOf("=",end + 1);
		end = str.length();
		this.cleaningWidth = Double.parseDouble(str.substring(start + 1, end));
	}
	
	public String toString() {
		return "VacuumCleaner [powerConsumption=" + powerConsumption + ", filterType=" + filterType + ", bagType="
				+ bagType + ", wandType=" + wandType + ", motorSpeedRegulation=" + motorSpeedRegulation
				+ ", cleaningWidth=" + cleaningWidth + "]";
	}
	
}
