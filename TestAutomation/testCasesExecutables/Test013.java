package org.openmrs;

import org.openmrs.util.DoubleRange;

public class Test013 {
	
	public static void main(String[] args) {
		
		DoubleRange range1 = new DoubleRange(10.0, 90.9);
		
		System.out.println(range1.contains(20.9));
	}
}
