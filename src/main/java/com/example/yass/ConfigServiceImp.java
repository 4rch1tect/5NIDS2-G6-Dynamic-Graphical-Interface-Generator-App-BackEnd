package com.example.yass;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConfigServiceImp implements ConfigService {

	@Autowired
	private ConfigRepository repository;

	@Override
	public List<Config> list() {
		return repository.findAll();
	}

	@Override
	public Config listId(int id) {
		return repository.findById(id);
	}

	@Override
	public Config add(Config c) {
		return repository.save(c);
	}

	@Override
	public Config edit(Config c) {
		return repository.save(c);
	}

	@Override
	public Config delete(int id) {
		Config c = repository.findById(id);
		if (c != null) {
			repository.delete(c);
		}
		return c;
	}

}
