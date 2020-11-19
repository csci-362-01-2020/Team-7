package org.openmrs;

import org.openmrs.util.DoubleRange;

public class Test019 {
	
	public static void main(String[] args) {
		
		DoubleRange range1 = new DoubleRange(10.0, 90.9);
		
		System.out.println(range1.contains(0.0));
	}
}
