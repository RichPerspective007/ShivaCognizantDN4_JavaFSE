package com.cognizant.dn4;

public class Product implements Comparable<Product> {
	public int productId;
	public String productName;
	public String category;
	
	public Product(int pId, String pName, String cat) {
		this.productId = pId;
		this.productName = pName;
		this.category = cat;
	}
	
	@Override
    public int compareTo(Product other) {
        return this.productName.compareToIgnoreCase(other.productName); // comparable by productName to fit 
    }                                                                   // users need for text-based search 
}