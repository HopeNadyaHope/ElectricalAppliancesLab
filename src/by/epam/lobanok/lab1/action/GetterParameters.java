package by.epam.lobanok.lab1.action;

import java.util.ArrayList;

public class GetterParameters {

	public ArrayList<String> getParameters(String str){
		ArrayList<String> parameters = new ArrayList<String>();
		
		int start;
		int end;
		start = str.indexOf("=");
		end = str.indexOf(",");
		
		while(end != -1) {
			parameters.add(str.substring(start + 1, end));
			start = str.indexOf("=",end + 1);
			end = str.indexOf(",", end + 1);
		}
		
		end = str.length();
		parameters.add(str.substring(start + 1, end));
		return parameters;
	}
}
