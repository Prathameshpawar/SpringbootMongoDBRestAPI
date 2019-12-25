package com.pp.mongodbrest.model;

import org.springframework.data.annotation.Id;

public class InventoryPojo {

	String itemName;
	int qty;
	double price;

	public InventoryPojo(String itemName, int qty, double price) {
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

	@Override
	public String toString() {
		return "Inventory [itemName=" + itemName + ", qty=" + qty + ", price=" + price + "]";
	}

}
