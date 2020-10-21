package org.openmrs;

public class Tests {
	
	public static void main(String[] args) {
		String str[] = { "1", "2", "3", "4", "Male" };
		
		System.out.println("Test 1:");
		Test1 test1 = new Test1();
		test1.test(str);
		
		System.out.println("\nTest 2:");
		Test2 test2 = new Test2();
		test2.test(str);
		
		System.out.println("\nTest 3:");
		Test3 test3 = new Test3();
		test3.test(str);
		
		System.out.println("\nTest 4:");
		Test4 test4 = new Test4();
		test4.test(str);
		
		System.out.println("\nTest 5:");
		Test5 test5 = new Test5();
		test5.test(str);
	}
	
}
