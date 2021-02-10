/**
 * 
 */
package com.ramanuj.javabasic.collections;

import java.util.Collections;
import java.util.List;

import com.ramanuj.javabasic.data.Invoice;
import com.ramanuj.javabasic.data.comparators.InvoiceAmountDueComparator;
import com.ramanuj.javabasic.helper.PopulateInvoice;

/**
 * @author Ramanuj Srivastava
 *
 */
public class ObjectComparisons {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Object Comparison");

		PopulateInvoice populateInvoice = new PopulateInvoice();

		try {
			List<Invoice> invoiceList = populateInvoice.getInvoice();
			System.out.println("Printing list of invoices");
			for (Invoice invoice : invoiceList) {
				System.out.println("-----------------");
				System.out.println(invoice);
			}
			System.out.println("");
			
			System.out.println("Sorted according to the Amount Due in ascending order");
			for (Invoice invoice : invoiceList) {
				System.out.println(invoice.getCustomerName() + " -> " + invoice.getAmountDue() + " | "
						+ invoice.getDueDate() + " | " + invoice.getStatus());
			}

			System.out.println(" ");
			InvoiceAmountDueComparator invoiceAmountDueComparatorDesc = new InvoiceAmountDueComparator(false);
			Collections.sort(invoiceList, invoiceAmountDueComparatorDesc);

			System.out.println("Sorted according to the Amount Due in descending order");
			for (Invoice invoice : invoiceList) {
				System.out.println(invoice.getCustomerName() + " -> " + invoice.getAmountDue() + " | "
						+ invoice.getDueDate() + " | " + invoice.getStatus() + " | " + invoice.getInvoiceId());
			}
			
			System.out.println(" ");
			Collections.sort(invoiceList);
			
			System.out.println("Sorted according to the Due date");
			for (Invoice invoice : invoiceList) {
				System.out.println(invoice.getCustomerName() + " -> " + invoice.getAmountDue() + " | "
						+ invoice.getDueDate() + " | " + invoice.getStatus() + " | " + invoice.getInvoiceId());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
