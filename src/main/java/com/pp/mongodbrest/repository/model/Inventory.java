package com.pp.mongodbrest.repository.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Inventory {

	@Id
	String id;
	String itemName;
	int qty;
	double price;

	public Inventory(String itemName, int qty, double price) {
		this.itemName = itemName;
		this.qty = qty;
		this.price = price;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Inventory [itemName=" + itemName + ", qty=" + qty + ", price=" + price + "]";
	}

}
