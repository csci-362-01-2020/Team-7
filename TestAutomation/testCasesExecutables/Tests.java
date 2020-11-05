package org.openmrs;

import java.io.*;

public class Tests {
	
	static String[] results;
	
	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter outFile = new PrintWriter(new FileOutputStream("src/main/java/org/openmrs/testReport.txt"));
		
		results = new String[6];
		
		String str[] = { "1", "2", "3", "4", "Male", "CEO" };
		
		System.out.println("Test 1:");
		Test1 test1 = new Test1();
		results[0] = test1.test(str);
		outFile.println("Test 1:\n" +
			"    Requirement Tested: User\n" +
			"    Component Tested: User id\n" +
			"    Method Tested: setId()\n" +
			"    Inputs: " + str[0] + "\n" +
			"    Expected Output: " + results[0] + "\n\n\n");
		
		
		System.out.println("\nTest 2:");
		Test2 test2 = new Test2();
		results[1] = test2.test(str);
		outFile.println("Test 2:\n" +
			"    Requirement Tested: User\n" +
			"    Component Tested: User id\n" +
			"    Method Tested: getId()\n" +
			"    Inputs: " + str[1] + "\n" +
			"    Expected Output: " + results[1] + "\n\n\n");
		
		System.out.println("\nTest 3:");
		Test3 test3 = new Test3();
		results[2] = test3.test(str);
		outFile.println("Test 3:\n" +
			"    Requirement Tested: Person\n" +
			"    Component Tested: Person id\n" +
			"    Method Tested: setId()\n" +
			"    Inputs: " + str[2] + "\n" +
			"    Expected Output: " + results[2] + "\n\n\n");
		
		System.out.println("\nTest 4:");
		Test4 test4 = new Test4();
		results[3] = test4.test(str);
		outFile.println("Test 4:\n" +
			"    Requirement Tested: Person\n" +
			"    Component Tested: Person id\n" +
			"    Method Tested: getId()\n" +
			"    Inputs: " + str[3] + "\n" +
			"    Expected Output: " + results[3] + "\n\n\n");
		
		System.out.println("\nTest 5:");
		Test5 test5 = new Test5();
		results[4] = test5.test(str);
		outFile.println("Test 5:\n" +
			"    Requirement Tested: User\n" +
			"    Component Tested: Person\n" +
			"    Method Tested: getPerson().getGender()\n" +
			"    Inputs: " + str[4] + "\n" +
			"    Expected Output: " + results[4] + "\n\n\n");

		System.out.println("\nTest 6:");
		Test6 test6 = new Test6();
		test6.test(str);
		
		outFile.flush();
		outFile.close();
	}
	
}
