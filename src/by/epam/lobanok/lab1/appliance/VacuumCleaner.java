package by.epam.lobanok.lab1.appliance;

import java.util.ArrayList;
import by.epam.lobanok.lab1.action.GetterParameters;


public class VacuumCleaner extends Appliance {
	
	int powerConsumption;
	String filterType;
	String bagType;
	String wandType;
	int motorSpeedRegulation;
	double cleaningWidth;

	
	public VacuumCleaner(String str) {
		GetterParameters getter = new GetterParameters();
		ArrayList<String> parameters = getter.getParameters(str);
		
		this.powerConsumption = Integer.parseInt(parameters.get(0));
		this.filterType = parameters.get(1);		
		this.bagType = parameters.get(2);
		this.wandType = parameters.get(3);	
		this.motorSpeedRegulation = Integer.parseInt(parameters.get(4));
		this.cleaningWidth = Double.parseDouble(parameters.get(5));
	}
	
	
	public String toString() {
		return "VacuumCleaner [powerConsumption=" + powerConsumption + ", filterType=" + filterType + ", bagType="
				+ bagType + ", wandType=" + wandType + ", motorSpeedRegulation=" + motorSpeedRegulation
				+ ", cleaningWidth=" + cleaningWidth + "]";
	}
	
}
