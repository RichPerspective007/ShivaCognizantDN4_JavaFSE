package com.cognizant.dn4;
import java.util.Arrays;
import java.util.Scanner;

public class EcommercePlatformInterface {
	public static Product linearSearch(Product[] products, String targetName) {
		System.out.println("Items encountered while linear searching: ");
	    for (Product product : products) {
	    	System.out.println("\t" + product.productName);
	        if (product.productName.equalsIgnoreCase(targetName)) {
	            return product;
	        }
	    }
	    return null;
	}
	public static Product binarySearch(Product[] products, String targetName) {
	    int left = 0, right = products.length - 1;
	    System.out.println("Items encountered while binary searching: ");
	    while (left <= right) {
	        int mid = left + (right - left) / 2;
	        int cmp = products[mid].productName.compareToIgnoreCase(targetName);
	        System.out.println("\t" + products[mid].productName);
	        if (cmp == 0) {
	        	return products[mid];
	        }
	        else if (cmp < 0) {
	        	left = mid + 1;
	        }
	        else {
	        	right = mid - 1;
	        }
	    }
	    return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product[] products = {
				new Product(1, "Shoes", "Fashion"),
	            new Product(2, "Laptop", "Electronics"),
	            new Product(3, "Watch", "Accessories"),
	            new Product(4, "Phone", "Electronics")
	    };
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name of the item to be searched: ");
        String searchTerm = sc.next();

        // Linear Search
        Product linearResult = linearSearch(products, searchTerm);
        System.out.println("Linear search result: " + (linearResult != null ? linearResult.productName : "Not Found"));
        
        // For binary search, array must be sorted by productName
        Arrays.sort(products);
        
        // Binary Search
        Product binaryResult = binarySearch(products, searchTerm);
        System.out.println("Binary search result: " + (binaryResult != null ? binaryResult.productName : "Not Found"));
	}
	
}
