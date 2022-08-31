package com.example.yass;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImp implements ClientService {

	@Autowired
	private ClientRepository repository;

	@Override
	public List<Client> list() {
		return repository.findAll();
	}

	@Override
	public Client listId(int id) {
		return repository.findById(id);
	}

	@Override
	public Client add(Client c) {
		return repository.save(c);
	}

	@Override
	public Client edit(Client c) {
		return repository.save(c);
	}

	@Override
	public Client delete(int id) {
		Client c = repository.findById(id);
		if (c != null) {
			repository.delete(c);
		}
		return c;
	}

}
