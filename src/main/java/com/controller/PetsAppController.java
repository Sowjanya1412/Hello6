package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Pets;
import com.service.PetService;

@RestController
public class PetsAppController {
	@Autowired
	private PetService petService;
	Pets pets;

	@RequestMapping(value = "/check")
	public String doChecking() {
		return "welcome";
	}
	@PostMapping(value = "/create")
	public Pets createPet(@RequestBody Pets pets){
		
		return this.petService.createPet(pets);
	}
	@PutMapping(value = "/update")
	public Pets updatePet(@RequestBody Pets pets){
		
		return this.petService.createPet(pets);
	}
	@DeleteMapping(value = "/delete/{id}")
	 public void deletePet(@PathVariable int id){
 this.petService.deletePetById(id);

	 }
}
