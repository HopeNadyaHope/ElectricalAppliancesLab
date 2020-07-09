package by.epam.lobanok.lab1.appliance;

public class Appliance {	
	
	public Appliance() {
		super();
	}	
	
	public static Appliance createAppliance(String str) {
		if(str.startsWith("Oven")) {
			return new Oven(str);
		}
		
		if(str.startsWith("Laptop")) {
			return new Laptop(str);
		}
		
		if(str.startsWith("Refrigerator")) {
			return new Refrigerator(str);
		}
		
		if(str.startsWith("VacuumCleaner")) {
			return new VacuumCleaner(str);
		}
		
		if(str.startsWith("TabletPC")) {
			return new TabletPC(str);
		}
		
		return new Speakers(str);
	}
	
}
