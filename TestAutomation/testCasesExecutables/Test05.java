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

public class Test05 {
	
	public String test(String[] args) {
		
		Person person = new Person(1);
		
		person.setGender(args[4]);
		
		User user = new User(person);
		
		System.out.println(user.getPerson().getGender());
		
		return user.getPerson().getGender();
		
	}
	
	public static void main(String[] args) {
		
		Person person = new Person(1);
		
		person.setGender(args[0]);
		//person.setGender("Male");
		
		User user = new User(person);
		
		System.out.println(user.getPerson().getGender());
		
	}
}
