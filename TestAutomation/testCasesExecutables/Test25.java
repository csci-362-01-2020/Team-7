package org.openmrs;

import org.openmrs.util.UserByNameComparator;
import org.openmrs.User;
import org.openmrs.Person;

public class Test25 {
	
	public static void main(String[] args) {
		UserByNameComparator n = new UserByNameComparator();
		
		//		User user1 = new User(1);
		//		User user2 = new User(1);
		
		User user1 = new User(Integer.parseInt(args[0]));
		User user2 = new User(Integer.parseInt(args[1]));
		
		System.out.println(n.compare(user1, user2));
	}
}
