package org.openmrs;

public class Test1 {
	
	public String test(String[] args) {
		
		User user1 = new User(6);
		
		System.out.println(user1.getUserId());
		
		user1.setUserId(Integer.parseInt(args[0]));
		
		System.out.println(user1.getUserId());
		
		return user1.getUserId().toString();
		
	}
	
	public static void main(String[] args) {
		User user1 = new User(6);
		
		System.out.println(user1.getUserId());
		
		user1.setUserId(Integer.parseInt(args[0]));
		
		System.out.println(user1.getUserId());
	}
}
