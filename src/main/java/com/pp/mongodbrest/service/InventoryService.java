package com.pp.mongodbrest.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.pp.mongodbrest.repository.model.Inventory;

/**
 * Contains method for generating loan plan.
 * 
 * @author PRATHAMESH PAWAR
 *
 */
public interface InventoryService {

	// Create
	public Inventory createInventory(String itemName, int qty, double price);

	// Retrieve
	public List<Inventory> getAll();

	// Retrieve
	public Inventory findByItemName(String itemName);
	
	//Retrieve
	public List<Inventory> getInventoriesByQty(int qty);

	// Update
	public Inventory updateInventory(String itemName, int qty, double price);

	// Delete
	public void deleteInventory(String itemName);

	// DeleteAll
	public void deleteAll();

}
