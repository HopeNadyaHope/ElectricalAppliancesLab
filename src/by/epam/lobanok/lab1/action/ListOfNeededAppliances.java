package by.epam.lobanok.lab1.action;

import java.util.ArrayList;

import by.epam.lobanok.lab1.appliance.Appliance;

public class ListOfNeededAppliances {
	
	ArrayList<Appliance> appliances;

	public ListOfNeededAppliances(String type, String characteristic, String value) throws Exception {
		Finder f = new Finder();
		ArrayList<String> lines = f.findAppliances(type, characteristic, value);
		
		appliances = new ArrayList<Appliance>();
		for(String str: lines) {
			Appliance app = Appliance.createAppliance(str);
			appliances.add(app);
		}
	}

	
	@Override
	public String toString() {
		if(appliances.isEmpty())
			return "No such appliances";
		String str = "";
		for(Appliance app : appliances) {
			str += app + "\n";
		}
		return str;
	}

}
