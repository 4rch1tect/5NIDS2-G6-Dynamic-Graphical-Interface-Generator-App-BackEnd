package com.example.yass;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/config"})

public class ControllerConfig {

	@Autowired
	ConfigService service;
	
	@GetMapping
	public List<Config>list(){
		return service.list();
	}
	
	@PostMapping
	public Config add(@RequestBody Config c) {
		return service.add(c);
	}
	
	@GetMapping(path = {"/{id}"})
	public Config listId(@PathVariable("id") int id) {
		return service.listId(id);
	}
	
	@PutMapping(path = {"/{id}"})
	public Config edit(@RequestBody Config c, @PathVariable("id") int id) {
		c.setId(id);
		return service.edit(c);
	}
	@DeleteMapping(path = {"/{id}"})
	public Config delete(@PathVariable("id") int id) {
		return service.delete(id);
	}
	
}