package org.openmrs;

public class Test2 {
	
	public void test(String[] args) {
		User user1 = new User(Integer.parseInt(args[1]));
		
		System.out.println(user1.getUserId());
	}
	
	public static void main(String[] args) {
		User user1 = new User(Integer.parseInt(args[0]));
		
		System.out.println(user1.getUserId());
	}
}
