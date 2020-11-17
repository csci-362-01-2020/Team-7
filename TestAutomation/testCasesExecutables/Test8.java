package org.openmrs;

import org.openmrs.util.DoubleRange;

public class Test8 {
	
	public static void main(String[] args) {
		
		DoubleRange range1 = new DoubleRange(34.0, 34.0);
		DoubleRange range2 = new DoubleRange(34.0, 34.0);
		
		System.out.println(range1.compareTo(range2));
		
	}
}
