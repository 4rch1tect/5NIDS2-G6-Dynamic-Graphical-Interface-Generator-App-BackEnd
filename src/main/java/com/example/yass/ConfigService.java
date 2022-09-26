package com.example.yass;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public interface ConfigService {

	List<Config> list(); //List all configs
	Config listId(int id); //List config By Id
	Config add (Config  c); //Add a config
	Config edit (Config c); //Edit a config
	Config delete(int id); //Delete a config
	
}





