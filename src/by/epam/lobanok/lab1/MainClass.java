package by.epam.lobanok.lab1;

import java.util.ArrayList;

public class MainClass {
	
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) throws Exception{
    	String type;
    	String characteristic;
    	
    	type = "Laptop";
    	characteristic = "OS=Windows";
    	
    	ArrayList<Appliance> items = Appliance.findItems(type, characteristic);    	
    	
    	if(items.isEmpty()) {
    		System.out.println("No such items");
    	}else {
    		for(Appliance i : items) {
    			System.out.println(i);			
    		}
    	}

	}

}
