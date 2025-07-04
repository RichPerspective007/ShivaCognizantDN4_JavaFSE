package com.cognizant.dn4;

public class ExcelDocumentFactory extends DocumentFactory {

	@Override
	public Document createDocument() {
		// TODO Auto-generated method stub
		return new ExcelDoc();
	}

}
