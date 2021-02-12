package com.ramanuj.javabasic.helper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ramanuj.javabasic.data.Product;

/**
 * 
 * @return
 */
public class PopulateProduct {

	public final String PRODUCT_DATE_FILE_PATH = "src/main/resources/data/products.json";

	public List<Product> getProducts() {

		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		List<Product> products = new ArrayList<Product>();

		try {
			products = objectMapper.readValue(new File(PRODUCT_DATE_FILE_PATH), new TypeReference<List<Product>>() {
			});

		} catch (IOException e) {
			e.printStackTrace();
		}

		return products;
	}

}
