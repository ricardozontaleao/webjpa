package com.example.test.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.example.test.model.City;

@Repository
public class DemoRepository {
	
    @PersistenceContext
    private EntityManager entityManager;

    public List<City> findAll(){
           return entityManager.createQuery("from City", City.class).getResultList();
    }
    
}
