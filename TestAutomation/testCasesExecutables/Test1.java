package org.openmrs;

public class Test1 {
	
	public void test(String[] args) {
		
		User user1 = new User(6);
		
		System.out.println(user1.getUserId());
		
		user1.setUserId(Integer.parseInt(args[0]));
		
		System.out.println(user1.getUserId());
		
	}
	
	public static void main(String[] args) {
		User user1 = new User(6);
		
		System.out.println(user1.getUserId());
		
		user1.setUserId(Integer.parseInt(args[0]));
		
		System.out.println(user1.getUserId());
	}
}
