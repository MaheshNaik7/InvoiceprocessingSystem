package com.invoiceprocessing.services;


import java.util.List;

import com.invoiceprocessing.entity.Invoice;


public interface InvoiceService {
	
	public Invoice addInvoice(Invoice invoice);
	
	public List<Invoice> getInvoices();
	
	public Invoice deleteInvoice(long id);

}
