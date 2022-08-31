package com.example.yass;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public interface ProduitService {

	List<Produit>list();
	Produit listId(int id);
	Produit add (Produit  p);
	Produit edit (Produit p);
	Produit delete(int id);
	
}
