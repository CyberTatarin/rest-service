package com.example.restservice;

import com.example.restservice.db.Person;
import com.example.restservice.repository.PersonRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping(value = "", produces = "application/json")
public class RestServiceApplication {

	@Autowired
	private PersonRep personRep;
	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);
	}

	@RequestMapping("create-person")
	public Person createPerson(){
		return personRep.save(new Person());
	}
}
