package org.openmrs;

public class Test3 {
	
	public void test(String[] args) {
		
		Person person = new Person(Integer.parseInt(args[2]));
		
		System.out.println(person.getPersonId());
	}
	
	public static void main(String[] args) {
		
		Person person = new Person(Integer.parseInt(args[0]));
		
		System.out.println(person.getPersonId());
	}
	
}
