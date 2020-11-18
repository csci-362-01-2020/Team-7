package org.openmrs;

import org.openmrs.util.NaturalStrings;

public class Test18 {
	
	public static void main(String[] args) {
		NaturalStrings string1 = new NaturalStrings();
		
		//System.out.println(string1.compareNaturalAscii("abc", "abc"));
		System.out.println(string1.compareNaturalAscii(args[0], args[1]));
	}
}
