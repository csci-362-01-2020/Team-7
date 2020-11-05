package org.openmrs;

public class Test2 {
	
	public String test(String[] args) {
		User user1 = new User(Integer.parseInt(args[1]));
		
		System.out.println(user1.getUserId());
		return user1.getUserId().toString();
	}
	
	public static void main(String[] args) {
		User user1 = new User(Integer.parseInt(args[0]));
		
		System.out.println(user1.getUserId());
	}
}
