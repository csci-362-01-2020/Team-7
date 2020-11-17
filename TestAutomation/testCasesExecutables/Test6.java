package org.openmrs;

import org.openmrs.util.DoubleRange;

public class Test6 {
	
	public static void main(String[] args) {
		
		DoubleRange range1 = new DoubleRange(78.9, 90.1);
		DoubleRange range2 = new DoubleRange(34.0, 56.0);
		
		System.out.println(range1.compareTo(range2));
		
	}
}
