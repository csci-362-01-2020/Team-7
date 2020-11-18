package org.openmrs;

import org.openmrs.Person;
import org.openmrs.User;
import org.openmrs.Provider;

public class Test19 {
	
	public static void main(String[] args) {
		//Provider n = new Provider(1);
		Provider n = new Provider(Integer.parseInt(args[0]));
		
		System.out.println(n.toString());
	}
}
