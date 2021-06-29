package com.example.Exercises;

public class Invoice {
	
	private String invoiceNumber;
	private String invoiceDescription;
	private int numItem;
	private double pricePerItem;
	
	public Invoice(String invoiceNumber, String invoiceDescription, int numItem, double pricePerItem) {
		this.invoiceNumber = invoiceNumber;
		this.invoiceDescription = invoiceDescription;
		this.numItem = numItem;
		this.pricePerItem = pricePerItem;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getInvoiceDescription() {
		return invoiceDescription;
	}

	public void setInvoiceDescription(String invoiceDescription) {
		this.invoiceDescription = invoiceDescription;
	}

	public int getNumItem() {
		return numItem;
	}

	public void setNumItem(int numItem) {
		this.numItem = numItem;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}
	
	public double getInvoiceAmount() {
		if (this.numItem <= 0 || this.pricePerItem <= 0) {
			return 0.0;
		}
		return (this.numItem * this.pricePerItem);
	}
	
}
