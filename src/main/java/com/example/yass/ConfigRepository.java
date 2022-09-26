package com.example.yass;

import java.util.List;
import org.springframework.data.repository.Repository;

public interface ConfigRepository extends Repository<Config, Integer> {

	List<Config>findAll(); //Return all configs
	Config findById(int id); //find config By Id
	Config save(Config c); //Insert object in the database
	void delete(Config c); //Delete a config
}



