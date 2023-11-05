package com.example.yass;

import org.springframework.data.repository.Repository;

import java.util.List;

public interface ClientRepository extends Repository<Client, Integer> {

	List<Client>findAll(); //Return all clients
    Client findById(int id); //find client By Id
	Client save(Client c); //Insert object in the database
	void delete(Client c); //Delete a client
}
