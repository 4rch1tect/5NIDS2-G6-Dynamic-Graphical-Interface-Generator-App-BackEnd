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
@RequestMapping({"/clients"})

public class ControllerClient {

	@Autowired
	ClientService service;
	
	@GetMapping
	public List<Client>list(){
		return service.list();
	}
	
	@PostMapping
	public Client add(@RequestBody Client c) {
		return service.add(c);
	}
	
	@GetMapping(path = {"/{id}"})
	public Client listId(@PathVariable("id") int id) {
		return service.listId(id);
	}
	
	@PutMapping(path = {"/{id}"})
	public Client edit(@RequestBody Client c, @PathVariable("id") int id) {
		c.setId(id);
		return service.edit(c);
	}
	@DeleteMapping(path = {"/{id}"})
	public Client delete(@PathVariable("id") int id) {
		return service.delete(id);
	}
	
}