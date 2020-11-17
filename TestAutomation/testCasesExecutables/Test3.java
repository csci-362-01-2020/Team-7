package org.openmrs;

import org.openmrs.util.NaturalStrings;

public class Test3 {
	
	public static void main(String[] args) {
		NaturalStrings string1 = new NaturalStrings();
		
		System.out.println(string1.compareNaturalIgnoreCaseAscii("ABC", "abc"));
	}
}
