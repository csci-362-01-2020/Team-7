package org.openmrs;

public class Test16 {
	
	public static void main(String[] args) {
		User user1 = new User();
		
		Role role = new Role(args[0]);
		Role role2 = new Role("Part-Timer");
		Role role3 = new Role("Graphic Designer");
		
		user1.addRole(role);
		user1.addRole(role2);
		user1.addRole(role3);
		
		user1.removeRole(role);
		
		System.out.println(user1.getAllRoles());
	}
}
