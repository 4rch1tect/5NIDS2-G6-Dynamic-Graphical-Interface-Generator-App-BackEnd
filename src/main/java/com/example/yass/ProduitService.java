package com.example.yass;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public interface ProduitService {

	List<Produit>list(); //List all products
	Produit listId(int id); //List product By Id
	Produit add (Produit  p); //Add a product
	Produit edit (Produit p); //Edit a product
	Produit delete(int id); //Delete a product
	
}




