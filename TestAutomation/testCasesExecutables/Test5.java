package org.openmrs;

public class Test5 {
	
	public void test(String[] args) {
		
		Person person = new Person(1);
		
		person.setGender(args[4]);
		
		User user = new User(person);
		
		System.out.println(user.getPerson().getGender());
		
	}
	
	public static void main(String[] args) {
		
		Person person = new Person(1);
		
		person.setGender("Male");
		
		User user = new User(person);
		
		System.out.println(user.getPerson().getGender());
		
	}
}
