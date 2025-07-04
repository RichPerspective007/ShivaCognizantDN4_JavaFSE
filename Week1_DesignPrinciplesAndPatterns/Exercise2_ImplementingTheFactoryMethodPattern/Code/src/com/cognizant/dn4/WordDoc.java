package com.cognizant.dn4;

public class WordDoc implements WordDocument {
	public WordDoc() {
		System.out.println("Word document created.");
	}

	@Override
	public void putHeader() {
		// TODO Auto-generated method stub

	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("Opening Word document...");
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("Saving Word document...");
	}

}
