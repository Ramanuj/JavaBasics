/**
 * 
 */
package com.ramanuj.javabasic.collections;

import java.util.Collections;
import java.util.List;

import com.ramanuj.javabasic.data.Invoice;
import com.ramanuj.javabasic.data.comparators.InvoiceAmountDueComparator;
import com.ramanuj.javabasic.helper.PopulateInvoice;
import com.ramanuj.javabasic.helper.PrintHelper;

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
			PrintHelper.PrintInvoiceList(invoiceList);

			System.out.println("Sorted according to the Amount Due in ascending order");
			PrintHelper.PrintInvoiceList(invoiceList);

			System.out.println(" ");
			InvoiceAmountDueComparator invoiceAmountDueComparatorDesc = new InvoiceAmountDueComparator(false);
			Collections.sort(invoiceList, invoiceAmountDueComparatorDesc);

			System.out.println("Sorted according to the Amount Due in descending order");
			PrintHelper.PrintInvoiceList(invoiceList);

			System.out.println(" ");
			Collections.sort(invoiceList);

			System.out.println("Sorted according to the Due date");
			PrintHelper.PrintInvoiceList(invoiceList);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
