/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs;

import org.openmrs.util.DoubleRange;

public class Test13 {
	
	public static void main(String[] args) {
		
		//DoubleRange range1 = new DoubleRange(10.0, 90.9);
		DoubleRange range1 = new DoubleRange(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
		
		//System.out.println(range1.contains(20.9));
		System.out.println(range1.contains(Double.parseDouble(args[2])));
	}
}
