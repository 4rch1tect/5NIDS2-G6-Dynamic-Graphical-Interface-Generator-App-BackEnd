package com.example.yass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class YassApplication {

public static void main(String[] args) {
SpringApplication.run(YassApplication.class, args);
}
@GetMapping("/")
public String hello(@RequestParam(value = "name", defaultValue = "Yassine") String name) {
return String.format("Hello %s!", name);
}
}