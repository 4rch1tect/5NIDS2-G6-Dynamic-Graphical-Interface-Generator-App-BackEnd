package com.example.yass;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public interface ClientService {

	List<Client> list();
	Client listId(int id);
	Client add (Client  c);
	Client edit (Client c);
	Client delete(int id);
	
}
