/**
 * 
 */
package com.ramanuj.javabasic.helper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ramanuj.javabasic.data.Invoice;

/**
 * @author Ramanuj Srivastava
 *
 */
public class PopulateInvoice {

	public final String INVOICE_DATE_FILE_PATH = "src/main/resources/data/invoices.json";

	public List<Invoice> getInvoice() {

		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		List<Invoice> invoices = new ArrayList<Invoice>();

		// reading a list
		try {
			invoices = objectMapper.readValue(new File(INVOICE_DATE_FILE_PATH), new TypeReference<List<Invoice>>() {
			});

		} catch (IOException e) {
			e.printStackTrace();
		}

		return invoices;
	}

}
