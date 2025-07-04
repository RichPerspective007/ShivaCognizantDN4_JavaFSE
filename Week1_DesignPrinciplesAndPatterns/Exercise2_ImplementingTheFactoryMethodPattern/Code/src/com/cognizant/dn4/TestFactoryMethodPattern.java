package com.cognizant.dn4;

public class TestFactoryMethodPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DocumentFactory wordDocFactory = new WordDocumentFactory();
		DocumentFactory pdfDocFactory = new PdfDocumentFactory();
		DocumentFactory excelDocFactory = new ExcelDocumentFactory();
		
		Document wordDoc1 = wordDocFactory.createDocument();
		wordDoc1.save();
		Document excelDoc1 = excelDocFactory.createDocument();
		excelDoc1.save();
		Document pdfDoc1 = pdfDocFactory.createDocument();
		pdfDoc1.save();
		
		Document wordDoc2 = wordDocFactory.createDocument();
		wordDoc2.save();
		Document excelDoc2 = excelDocFactory.createDocument();
		excelDoc2.save();
		Document pdfDoc2 = pdfDocFactory.createDocument();
		pdfDoc2.save();
	}

}
