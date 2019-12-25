package com.pp.mongodbrest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pp.mongodbrest.repository.InventoryRepository;
import com.pp.mongodbrest.repository.model.Inventory;
import com.pp.mongodbrest.service.InventoryService;

/**
 * Implementation of {@link mongodbrestService}
 * 
 * @author PRATHAMESH PAWAR
 *
 */
@Service
public class InventoryServiceImpl implements InventoryService {

	@Autowired
	private InventoryRepository inventoryRepository;

	// Create
	public Inventory createInventory(String itemName, int qty, double price) {
		return inventoryRepository.save(new Inventory(itemName, qty, price));
	}

	// Retrieve
	public List<Inventory> getAll() {
		return inventoryRepository.findAll();
	}

	// Retrieve
	public Inventory findByItemName(String itemName) {
		return inventoryRepository.findByItemName(itemName);
	}

	// Update
	public Inventory updateInventory(String itemName, int qty, double price) {
		
		Inventory inventory = inventoryRepository.findByItemName(itemName);
		if (null != inventory) {
			inventory.setQty(qty);
			inventory.setPrice(price);
			inventory = inventoryRepository.save(inventory);
		}
		return inventory;
	}

	// Delete
	public void deleteInventory(String itemName) {
		Inventory inventory = inventoryRepository.findByItemName(itemName);
		inventoryRepository.deleteById(inventory.getId());
	}

	// DeleteAll
	public void deleteAll() {
		inventoryRepository.deleteAll();
	}


	@Override
	public List<Inventory> getInventoriesByQty(int qty) {
		return inventoryRepository.findByQty(qty);
	}
}