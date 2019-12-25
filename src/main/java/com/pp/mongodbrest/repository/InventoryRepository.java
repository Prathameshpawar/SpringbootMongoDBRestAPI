package com.pp.mongodbrest.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pp.mongodbrest.repository.model.Inventory;
@Repository
public interface InventoryRepository extends MongoRepository<Inventory, String> {
	public Inventory findByItemName(String itemName);

	public List<Inventory> findByQty(int qty);
}
