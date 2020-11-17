package org.openmrs;

import org.openmrs.util.NaturalStrings;

public class Test2 {
	
	public static void main(String[] args) {
		NaturalStrings string1 = new NaturalStrings();
		
		System.out.println(string1.compareNaturalAscii("abc", "adc"));
	}
}
