package com.invoiceprocessing.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invoiceprocessing.Repository.InvoiceRepository;
import com.invoiceprocessing.entity.Invoice;

@Service
public class InvoiceServiceImpl implements InvoiceService {
	
	@Autowired
	InvoiceRepository invoiceRepo;

	@Override
	public Invoice addInvoice(Invoice invoice) {
		invoiceRepo.save(invoice);
		return invoice;
	}

	@Override
	public List<Invoice> getInvoices() {
		return invoiceRepo.findAll();
	}

	@Override
	public Invoice deleteInvoice(long id) {
		Invoice invoice = invoiceRepo.findById(id).get();
		invoiceRepo.delete(invoice);
		return invoice;
	}

}
