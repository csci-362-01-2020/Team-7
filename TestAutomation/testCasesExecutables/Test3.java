package org.openmrs;

public class Test3 {
	
	public String test(String[] args) {
		
		Person person = new Person(Integer.parseInt(args[2]));
		
		System.out.println(person.getPersonId());
		
		return person.getPersonId().toString();
	}
	
	public static void main(String[] args) {
		
		Person person = new Person(Integer.parseInt(args[0]));
		
		System.out.println(person.getPersonId());
	}
	
}
