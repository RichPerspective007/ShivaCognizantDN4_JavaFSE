package com.cognizant.dn4;

public class PdfDoc implements PdfDocument {
	public PdfDoc() {
		System.out.println("Pdf Document created.");
	}

	@Override
	public void printPdf() {
		// TODO Auto-generated method stub

	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("Opening Pdf document...");
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("Saving Pdf document...");
	}

}
