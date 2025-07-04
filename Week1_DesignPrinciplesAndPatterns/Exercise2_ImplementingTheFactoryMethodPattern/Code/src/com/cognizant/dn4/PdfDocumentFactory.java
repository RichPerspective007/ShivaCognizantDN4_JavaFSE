package com.cognizant.dn4;

public class PdfDocumentFactory extends DocumentFactory {

	@Override
	public Document createDocument() {
		// TODO Auto-generated method stub
		return new PdfDoc();
	}

}
