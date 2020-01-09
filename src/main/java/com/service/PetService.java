package com.service;

import com.model.Pets;

public interface PetService {
	public void deletePetById(int Id);
	public Pets createPet(Pets pets);
	public Pets updatePet(Pets pets);
}
