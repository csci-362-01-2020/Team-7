package org.openmrs;

public class Test12 {
	
	public static void main(String[] args) {
		User user1 = new User();
		
		Role role = new Role(args[0]);
		//Role role = new Role("Graphic Designer");
		
		user1.addRole(role);
		
		System.out.println(user1.isSuperUser());
	}
}
