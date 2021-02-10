/**
 * 
 */
package com.ramanuj.javabasic.data.comparators;

import java.util.Comparator;

import com.ramanuj.javabasic.data.Invoice;

/**
 * This comprator will sort on Amount due
 * 
 * @author Ramanuj Srivastava
 *
 */
public class InvoiceAmountDueComparator implements Comparator<Invoice> {

	public boolean orderAsc;

	/**
	 * Order to determine if sorting needs to be done in ascending order or not
	 * 
	 * @param orderAsc
	 */
	public InvoiceAmountDueComparator(boolean orderAsc) {
		this.orderAsc = orderAsc;
	}

	@Override
	public int compare(Invoice o1, Invoice o2) {
		if (orderAsc) {
			return Double.compare(o1.getAmountDue(), o2.getAmountDue());
		} else {
			return Double.compare(o2.getAmountDue(), o1.getAmountDue());
		}
	}

}
