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

public class Test15 {
	
	public void test(String[] args) {
		Privilege privilege = new Privilege(args[5]);
		System.out.println(privilege.getPrivilege());
	}
	
	public static void main(String[] args) {
		Allergy allergy = new Allergy();
		Allergy allergy2 = new Allergy();
		
		AllergenType allergenType = AllergenType.valueOf(args[0]);
		AllergenType allergenType2 = AllergenType.valueOf(args[1]);
		
//		AllergenType allergenType = AllergenType.DRUG;
//		AllergenType allergenType2 = AllergenType.FOOD;
		
		Allergen allergen = new Allergen(allergenType, null, null);
		Allergen allergen2 = new Allergen(allergenType2, null, null);
		
		allergy.setAllergen(allergen);
		allergy2.setAllergen(allergen2);
		
		System.out.println(allergy.hasSameAllergen(allergy2));
	}
}
