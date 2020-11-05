package org.openmrs;

public class Test4 {
	
	public String test(String[] args) {
		
		Person person = new Person(8);
		
		System.out.println(person.getPersonId());
		
		person.setPersonId(Integer.parseInt(args[3]));
		
		System.out.println(person.getPersonId());
		
		return person.getPersonId().toString();
	}
	
	public static void main(String[] args) {
		
		Person person = new Person(4);
		
		System.out.println(person.getPersonId());
		
		person.setPersonId(7);
		
		System.out.println(person.getPersonId());
	}
	
}
