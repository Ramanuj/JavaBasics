package com.ramanuj.javabasic.data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

/**
 * This class will carry information about the invoice
 * 
 * @author Ramanuj Srivastava
 *
 */
public class Invoice implements Serializable, Comparable<Invoice> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -673241018631319499L;

	private Long invoiceId;

	private Integer invoiceNumber;

	private Double amountDue;

	private Double amountPaid;

	private LocalDate dueDate;

	private String customerName;

	private String status;

	public Invoice(InvoiceBuilder builder) {
		this.invoiceId = builder.invoiceId;
		this.invoiceNumber = builder.invoiceNumber;
		this.amountDue = builder.amountDue;
		this.amountPaid = builder.amountPaid;
		this.dueDate = builder.dueDate;
		this.customerName = builder.customerName;
		this.status = builder.status;
	}

	@Override
	public String toString() {

		return String.format(
				"Id : %d\ninvoiceNumber : %d\nCustomer : %s\nDue : %f\nPaid : %f\nDue Date : %tD\nStatus : %s",
				this.invoiceId, this.invoiceNumber, this.customerName, this.amountDue, this.amountPaid, this.dueDate,
				this.status);
	}

	/**
	 * @return the invoiceId
	 */
	public Long getInvoiceId() {
		return invoiceId;
	}

	/**
	 * @param invoiceId the invoiceId to set
	 */
	public void setInvoiceId(Long invoiceId) {
		this.invoiceId = invoiceId;
	}

	/**
	 * @return the invoiceNumber
	 */
	public Integer getInvoiceNumber() {
		return invoiceNumber;
	}

	/**
	 * @param invoiceNumber the invoiceNumber to set
	 */
	public void setInvoiceNumber(Integer invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	/**
	 * @return the amountDue
	 */
	public Double getAmountDue() {
		return amountDue;
	}

	/**
	 * @param amountDue the amountDue to set
	 */
	public void setAmountDue(Double amountDue) {
		this.amountDue = amountDue;
	}

	/**
	 * @return the amountPaid
	 */
	public Double getAmountPaid() {
		return amountPaid;
	}

	/**
	 * @param amountPaid the amountPaid to set
	 */
	public void setAmountPaid(Double amountPaid) {
		this.amountPaid = amountPaid;
	}

	/**
	 * @return the dueDate
	 */
	public LocalDate getDueDate() {
		return dueDate;
	}

	/**
	 * @param dueDate the dueDate to set
	 */
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Builder class
	 * 
	 * @author Ramanuj Srivastava
	 *
	 */
	public static class InvoiceBuilder {

		private Long invoiceId;
		private Integer invoiceNumber;
		private Double amountDue;
		private Double amountPaid;
		private LocalDate dueDate;
		private String customerName;
		private String status;

		public InvoiceBuilder(Integer invoiceNumber, Double amountDue, String customerName) {

			long id = ThreadLocalRandom.current().nextLong();

			if (id < 0)
				id = id * (-1);

			this.invoiceId = id;
			this.invoiceNumber = invoiceNumber;
			this.amountDue = amountDue;
			this.customerName = customerName;
		}

		public InvoiceBuilder withAmountPaid(Double amountPaid) {
			this.amountPaid = amountPaid;
			return this;
		}

		public InvoiceBuilder withDueDate(LocalDate dueDate) {
			this.dueDate = dueDate;
			return this;
		}

		public InvoiceBuilder withStatus(String status) {
			this.status = status;
			return this;
		}

		public Invoice build() {
			return new Invoice(this);
		}

	}

	/**
	 * Comparison method for comparing other objects of the same class with this
	 */
	@Override
	public int compareTo(Invoice o) {
		return this.dueDate.compareTo(o.dueDate);
	}

}
