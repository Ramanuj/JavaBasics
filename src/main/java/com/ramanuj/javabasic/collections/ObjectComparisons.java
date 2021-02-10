/**
 * 
 */
package com.ramanuj.javabasic.collections;

import java.util.List;

import com.ramanuj.javabasic.data.Invoice;
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
			List<Invoice> invoices = populateInvoice.getInvoice();
			System.out.println("Printing list of invoices");
			for (Invoice invoice : invoices) {
				System.out.println("-----------------");
				System.out.println(invoice);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
