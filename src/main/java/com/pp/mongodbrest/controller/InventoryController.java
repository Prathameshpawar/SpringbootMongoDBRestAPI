package com.pp.mongodbrest.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pp.mongodbrest.model.InventoryPojo;
import com.pp.mongodbrest.repository.model.Inventory;
import com.pp.mongodbrest.service.InventoryService;

/**
 * 
 * @author PRATHAMESH PAWAR
 *
 */
@RestController
public class InventoryController {
	private final Logger LOG = LoggerFactory.getLogger(getClass());

	@Autowired
	private InventoryService inventoryService;

	@GetMapping("/createInventory")
	public Inventory createInventory(@RequestParam String itemName, @RequestParam double price, @RequestParam int qty) {
		return inventoryService.createInventory(itemName, qty, price);
	}

	@PostMapping(path = "/createInventory", consumes = "application/json", produces = "application/json")
	public Inventory createInventoryPostMethod(@RequestBody InventoryPojo newInventory) {
		LOG.info("creating inventory..");
		return inventoryService.createInventory(newInventory.getItemName(), newInventory.getQty(),
				newInventory.getPrice());
	}

	@GetMapping("/getAllInventory")
	public List<Inventory> getAllInventory() {
		LOG.info("get all inventory..");
		return inventoryService.getAll();
	}

	@GetMapping("/getInventory")
	public Inventory getInventory(@RequestParam String itemName) {
		Inventory inventory = inventoryService.findByItemName(itemName);
		return inventory;
	}

	@GetMapping("/getInventory/{qty}")
	public List<Inventory> getInventoriesByQty(@PathVariable int qty) {
		return inventoryService.getInventoriesByQty(qty);
	}

	@GetMapping("/updateInventory")
	public Inventory updateInventory(@RequestParam String itemName, @RequestParam int qty, @RequestParam double price) {
		Inventory updatedInventory = inventoryService.updateInventory(itemName, qty, price);
		return updatedInventory;
	}

	@GetMapping("/deleteInventory")
	public String deleteInventory(@RequestParam String itemName) {
		inventoryService.deleteInventory(itemName);
		return itemName + "inventory deleted..";
	}

	@GetMapping("/deleteAllRepository")
	public String deleteAllRepository() {
		inventoryService.deleteAll();
		return "all repositories deleted..";
	}

	@GetMapping(path = "/ping", produces = "application/json")
	public String ping() {
		return "Hi from Inventory application";
	}
}
