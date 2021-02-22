package com.ramanuj.javabasic.collections;

import java.util.Collections;
import java.util.Comparator;
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

			PrintHelper.printProductList(productList);

			System.out.println("Sorting based on name");
			/**
			 * No need of specifying the type definition. Compiler infers it by default.
			 */
			productList.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
			PrintHelper.printProductList(productList);

			/**
			 * 
			 */
			System.out.println("Sorting by name and then rating");
			productList.sort(Product::compareByNameThenRating);
			PrintHelper.printProductList(productList);

			System.out.println("Sorting by brand and then name");
			productList.sort(Product::compareByBrandThenName);
			PrintHelper.printProductList(productList);

			Collections.sort(productList, Comparator.comparing(Product::getPrice));
			PrintHelper.printProductList(productList);

			System.out.println("Sorting by brand and then name again");
			productList.sort(Comparator.comparing(Product::getBrand).thenComparing(Product::getName));
			PrintHelper.printProductList(productList);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
