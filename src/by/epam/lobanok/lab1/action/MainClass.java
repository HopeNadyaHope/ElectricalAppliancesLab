package by.epam.lobanok.lab1.action;


public class MainClass {
	
	public static void main(String[] args) throws Exception{
    	String type;
    	String characteristic;   
    	String value;
    	type = "Laptop";
    	characteristic = "OS";
    	value = "Windows";

    	
    	ListOfNeededAppliances appliances = new ListOfNeededAppliances(type,characteristic,value);
    	System.out.println(appliances);
	}

}