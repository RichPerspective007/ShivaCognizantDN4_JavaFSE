package com.cognizant.dn4;

public class ExcelDoc implements ExcelDocument {
	public ExcelDoc() {
		System.out.println("Excel Document created.");
	}
	
	@Override
	public double getSummation() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("Opening Excel document...");
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("Saving Excel document...");
	}

}
