package org.openmrs;

import org.openmrs.util.Format;

public class Test24 {
	
	public static void main(String[] args) {
		
		Format string1 = new Format();
		
		//System.out.println(string1.formatPercentage(.98));
		System.out.println(string1.formatPercentage(Double.parseDouble(args[0])));
		
	}
}
