package by.epam.lobanok.lab1;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Appliance {
	
	public static ArrayList<Appliance> findItems(String type, String characteristic) throws Exception{
		File file = new File("appliances_db.txt");
    	Scanner in = new Scanner(file);    	
    	ArrayList<Appliance> items = new ArrayList<Appliance>();
		String str;
    	
    	while(in.hasNextLine()) {
			str=in.nextLine();
			if( (str.contains(type)) && (str.contains(characteristic)) ) {
				items.add(createItem(str));
			}
		}

    	in.close();
		return items;
	}
	
	public static Appliance createItem(String str) {
		if(str.contains("Oven")) {
			return new Oven(str);
		}
		
		if(str.contains("Laptop")) {
			return new Laptop(str);
		}
		
		if(str.contains("Refregerator")) {
			return new Refrigerator(str);
		}
		
		if(str.contains("VacuumCleaner")) {
			return new VacuumCleaner(str);
		}
		
		if(str.contains("TabletPC")) {
			return new TabletPC(str);
		}
		
		if(str.contains("Speakers")) {
			return new Speakers(str);
		}		
		
		return null;
	}

}
