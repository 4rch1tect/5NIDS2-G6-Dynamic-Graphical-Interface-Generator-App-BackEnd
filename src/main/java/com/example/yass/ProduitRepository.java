package com.example.yass;

import java.util.List;
import org.springframework.data.repository.Repository;

public interface ProduitRepository extends Repository<Produit, Integer> {

	List<Produit>findAll(); //Return all products
	Produit findById(int id); //find product By Id
	Produit save(Produit p); //Insert object in the database
	void delete(Produit p); //Delete a product
}


