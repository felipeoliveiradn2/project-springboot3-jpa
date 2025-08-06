package com.portifolio.project.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portifolio.project.entities.User;

//RestController é o implementador do recurso Web UserResource

@RestController
@RequestMapping(value = "/users") //para buscar na url
public class UserResource {
	
	@GetMapping //para responder o get do HTTP
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "12345");
		return ResponseEntity.ok().body(u);
	}	
}
