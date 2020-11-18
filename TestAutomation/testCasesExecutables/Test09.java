package org.openmrs;

import org.openmrs.util.LocaleUtility;

public class Test09 {
	
	public static void main(String[] args) {
		
		LocaleUtility string1 = new LocaleUtility();
		
		//System.out.println(string1.fromSpecification("eg_US_36"));
		System.out.println(string1.fromSpecification(args[0]));
	}
}
