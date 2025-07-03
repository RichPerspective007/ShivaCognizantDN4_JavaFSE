package com.cognizant.dn4;

public class TestSingletonPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger inst1 = Logger.getLogger();
		Logger inst2 = Logger.getLogger();
		
		// Logger inst3 = new Logger(); ---> Does not work because constructor visibility is set to private. 
		// So, new instances cannot be created from outside the Logger class.
		
		if (inst1 == inst2) {
			System.out.println("Both the reference variables point to same Logger instance.");
		}
		else {
			System.out.println("The reference variables do not point to the same Logger instance.");
		}
	}

}
