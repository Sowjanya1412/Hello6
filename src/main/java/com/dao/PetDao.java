package com.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.Pets;

@Repository
public interface PetDao extends CrudRepository<Pets,Integer> {

	
}