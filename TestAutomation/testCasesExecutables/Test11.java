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

public class Test11 {
	
	public static void main(String[] args) {
		User user1 = new User();
		
		Role role = new Role(args[0] + " " + args[1]);
		//Role role = new Role("System Developer");
		
		user1.addRole(role);
		
		// Super user is "System Developer"
		System.out.println(user1.isSuperUser());
	}
}
