package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.PetDao;
import com.model.Pets;

@Service
public class PetServiceImpl implements PetService {
	@Autowired

	private PetDao petDao;
	Pets pets;

	/*@Override
	public void deletePetById(int id) 
    {
        Optional<Pets> pets = petDao.findById(id);
        	petDao.deleteById(id);
        
}*/
	@Override
	public Pets createPet(Pets pets) {
		return this.petDao.save(pets);
	}
	@Override
	public Pets updatePet(Pets pets) {
		return this.petDao.save(pets);
	}
	@Override
	 public void deletePetById(int id) {

	 this.petDao.deleteById(id);

	 }

	 
}