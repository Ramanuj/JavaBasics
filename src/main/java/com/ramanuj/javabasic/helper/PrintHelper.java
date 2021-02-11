/**
 * 
 */
package com.ramanuj.javabasic.helper;

import java.util.Arrays;
import java.util.List;

import com.ramanuj.javabasic.data.Invoice;

/**
 * @author Ramanuj Srivastava
 *
 */
public class PrintHelper {

	private final static List<String> HEADER_INVOICE = Arrays.asList("Invoice Id", "Invoice Number", "Amount Due", "Amount Paid", "Due Date",
			"Customer Name", "Status");

	public static void PrintInvoiceList(List<Invoice> invoiceList) {

		System.out.printf("\n%1$15s %2$15s %3$15s %4$15s %5$15s %6$15s %7$15s", HEADER_INVOICE.toArray());
		System.out.print("\n---------------------------------------------------------------------------------------------------------------------\n");
		for (Invoice invoice : invoiceList) {
			// String dueDatStr = String.format("%1$tY-%1$tm-%1$te", invoice.getDueDate());
			// System.out.printf("\n%1$15d %2$15d %3$15.2f %4$15.2f %5$15s %6$15s %7$15s", invoice.getInvoiceId(), invoice.getInvoiceNumber(),
			// invoice.getAmountDue(),
			// invoice.getAmountPaid(), dueDatStr, invoice.getCustomerName(), invoice.getStatus());
			System.out.println(invoice);
		}
		System.out.println("");
	}
}
