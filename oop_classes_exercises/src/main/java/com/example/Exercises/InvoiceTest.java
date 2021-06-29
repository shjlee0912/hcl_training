package com.example.Exercises;

public class InvoiceTest {

	public static void main(String[] args) {
	
		Invoice inv1 = new Invoice("38", "Default", 5, 4.5);
		//getInvoiceAmount();
		double invAmount = inv1.getInvoiceAmount();
		
		System.out.println(invAmount);
		
		inv1.setNumItem(10);
		inv1.setPricePerItem(5.79);
		System.out.println(inv1.getInvoiceAmount());
	}

}
