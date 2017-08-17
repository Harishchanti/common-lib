package com.ailiens.optimusprime.autobots.rest.dto;

public class InvoiceLineDTO {

	private Long invoiceLineID;

	private Long invoiceID;

	public InvoiceLineDTO(InvoiceLine invoiceLine)
	{
		if(invoiceLine != null) {
			this.invoiceLineID = invoiceLine.getId();
			this.invoiceID = invoiceLine.getInvoice().getId();
		}
	}
	public InvoiceLineDTO(){

	}

	public Long getInvoiceLineID() {
		return invoiceLineID;
	}

	public void setInvoiceLineID(Long invoiceLineID) {
		this.invoiceLineID = invoiceLineID;
	}

	public Long getInvoiceID() {
		return invoiceID;
	}

	public void setInvoiceID(Long invoiceID) {
		this.invoiceID = invoiceID;
	}
}
