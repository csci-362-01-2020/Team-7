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

public class Test13 {
	
	public String test(String[] args) {
		
		Person person = new Person(Integer.parseInt(args[2]));
		
		System.out.println(person.getPersonId());
		
		return person.getPersonId().toString();
	}
	
	public static void main(String[] args) {
		
		Person person = new Person();
		PersonAddress personAddress = new PersonAddress(1);
		personAddress.setAddress1(args[0]);
		person.addAddress(personAddress);
		System.out.println(person.getAddresses());
	}
	
}
