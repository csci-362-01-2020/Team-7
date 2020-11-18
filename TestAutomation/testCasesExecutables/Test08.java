package org.openmrs;

import org.openmrs.util.DoubleRange;

public class Test08 {
	
	public static void main(String[] args) {

		double low1 = Double.parseDouble(args[0]);
		double high1 = Double.parseDouble(args[1]);

		double low2 = Double.parseDouble(args[2]);
		double high2 = Double.parseDouble(args[3]);
		
//		DoubleRange range1 = new DoubleRange(34.0, 34.0);
//		DoubleRange range2 = new DoubleRange(34.0, 34.0);

		DoubleRange range1 = new DoubleRange(low1, high1);
		DoubleRange range2 = new DoubleRange(low2, high2);
		
		System.out.println(range1.compareTo(range2));
		
	}
}
