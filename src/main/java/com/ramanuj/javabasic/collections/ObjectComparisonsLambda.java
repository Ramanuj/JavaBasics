package com.ramanuj.javabasic.collections;

import java.util.List;

import com.ramanuj.javabasic.data.Product;
import com.ramanuj.javabasic.helper.PopulateProduct;
import com.ramanuj.javabasic.helper.PrintHelper;

/**
 * 
 * @author Ramanuj Srivastava
 *
 */
public class ObjectComparisonsLambda {

	public static void main(String[] args) {

		try {
			PopulateProduct populateProduct = new PopulateProduct();
			List<Product> productList = populateProduct.getProducts();

			PrintHelper.PrintProductList(productList);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
