package com.example.yass;

import java.util.List;
import org.springframework.data.repository.Repository;

public interface ProduitRepository extends Repository<Produit, Integer> {

	List<Produit>findAll();
	Produit findById(int id);
	Produit save(Produit p);
	void delete(Produit p);
}
