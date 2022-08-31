package com.example.yass;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProduitServiceImp implements ProduitService {

	@Autowired
	private ProduitRepository repository;

	@Override
	public List<Produit> list() {
		return repository.findAll();
	}

	@Override
	public Produit listId(int id) {
		return repository.findById(id);
	}

	@Override
	public Produit add(Produit p) {
		return repository.save(p);
	}

	@Override
	public Produit edit(Produit p) {
		return repository.save(p);
	}

	@Override
	public Produit delete(int id) {
		Produit p = repository.findById(id);
		if (p != null) {
			repository.delete(p);
		}
		return p;
	}

}
