package com.example.yass;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public interface ConfigService {

	List<Config> list();
	Config listId(int id);
	Config add (Config  c);
	Config edit (Config c);
	Config delete(int id);
	
}
