package com.example.yass;

import org.springframework.stereotype.Service;

import java.util.List;
@Service ("cl")
public interface ClientService {

	List<Client> list(); //List all clients
	Client listId(int id); //List client By Id
	Client add (Client  c); //Add a client
	Client edit (Client c); //Edit a client
	Client delete(int id); //Delete a client
	
}
