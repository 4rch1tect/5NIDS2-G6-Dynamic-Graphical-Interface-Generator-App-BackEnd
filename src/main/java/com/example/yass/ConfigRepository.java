package com.example.yass;

import java.util.List;
import org.springframework.data.repository.Repository;

public interface ConfigRepository extends Repository<Config, Integer> {

	List<Config>findAll();
	Config findById(int id);
	Config save(Config c);
	void delete(Config c);
}
