package org.openmrs;

import org.openmrs.util.Format;

public class Test21 {
	
	public static void main(String[] args) {
		Format string1 = new Format();
		
		Double x;
		
		if (args[0].compareTo("null") == 0)
			x = null;
		else
			x = Double.parseDouble(args[0]);
		
		System.out.println(string1.formatPercentage(x));
		
	}
}
