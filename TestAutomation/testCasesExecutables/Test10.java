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

public class Test10 {
	
	public String test(String[] args) {
		
		User user1 = new User(6);
		
		System.out.println(user1.getUserId());
		
		user1.setUserId(Integer.parseInt(args[0]));
		
		System.out.println(user1.getUserId());
		
		return user1.getUserId().toString();
		
	}
	
	public static void main(String[] args) {
		User user1 = new User();
		
		Role role = new Role(args[0]);
		
		user1.addRole(role);
		
		System.out.println(user1.hasRole(args[0]));
		
	}
}
