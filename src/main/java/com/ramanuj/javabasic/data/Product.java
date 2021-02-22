/**
 * 
 */
package com.ramanuj.javabasic.data;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.ramanuj.javabasic.util.LocalDateTimeDeserializer;
import com.ramanuj.javabasic.util.LocalDateTimeSerializer;

/**
 * This class will carry information about the Products
 * 
 * @author Ramanuj Srivastava
 *
 */
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8323480178935559393L;

	@JsonProperty("Product ID")
	private String productID;

	@JsonProperty("SKU")
	private String sku;

	@JsonProperty("Name")
	private String name;

	@JsonProperty("Price")
	private Double price;

	@JsonProperty("Retail Price")
	private Double retailPrice;

	@JsonProperty("Brand")
	private String brand;

	@JsonProperty("Rating Avg")
	private Double ratingavg;

	@JsonProperty("Rating Count")
	private Integer ratingCount;

	@JsonProperty("Inventory Count")
	private Integer inventoryCount;

	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@JsonProperty("Date Created")
	private LocalDateTime dateCreated;

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();

		String dueDatStr = String.format("%1$tY-%1$tm-%1$te", dateCreated);
		sb.append(String.format("%1$15s %2$15s %3$50s %4$15.2f %5$15.2f %6$25s %7$15.1f %8$15d %9$15d %10$15s", productID, sku, name, price,
				retailPrice, brand, ratingavg, ratingCount, inventoryCount, dueDatStr));

		return sb.toString();
	}

	public static int compareByNameThenRating(Product lhs, Product rhs) {
		if (lhs.name.equals(rhs.name)) {
			return Double.compare(lhs.ratingavg, rhs.ratingavg);
		} else {
			return lhs.name.compareTo(rhs.name);
		}
	}

	public static int compareByBrandThenName(Product lhs, Product rhs) {
		if (lhs.brand.equals(rhs.brand)) {
			return lhs.name.compareTo(rhs.name);
		} else {
			return lhs.brand.compareTo(rhs.brand);
		}
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(Double retailPrice) {
		this.retailPrice = retailPrice;
	}

	public Double getRatingavg() {
		return ratingavg;
	}

	public void setRatingavg(Double ratingavg) {
		this.ratingavg = ratingavg;
	}

	public Integer getRatingCount() {
		return ratingCount;
	}

	public void setRatingCount(Integer ratingCount) {
		this.ratingCount = ratingCount;
	}

	public Integer getInventoryCount() {
		return inventoryCount;
	}

	public void setInventoryCount(Integer inventoryCount) {
		this.inventoryCount = inventoryCount;
	}

	public LocalDateTime getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(LocalDateTime dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}
