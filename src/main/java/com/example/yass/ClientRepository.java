package com.example.yass;

import java.util.List;
import org.springframework.data.repository.Repository;

public interface ClientRepository extends Repository<Client, Integer> {

	List<Client>findAll();
	Client findById(int id);
	Client save(Client c);
	void delete(Client c);
}
