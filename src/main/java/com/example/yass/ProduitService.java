package com.example.yass;

import org.springframework.stereotype.Service;

import java.util.List;
@Service("p")
public interface ProduitService {

	List<Produit>list(); //List all products
	Produit listId(int id); //List product By Id
	Produit add (Produit  p); //Add a product
	Produit edit (Produit p); //Edit a product
	Produit delete(int id); //Delete a product
	
}




