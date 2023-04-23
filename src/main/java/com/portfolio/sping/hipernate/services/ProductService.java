package com.portfolio.sping.hipernate.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.sping.hipernate.entitites.Product;
import com.portfolio.sping.hipernate.repositories.ProductRepository;


@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
		
		
	}
	
public Product findByID(Long id) {
	
Optional<Product> obj = repository.findById(id);
	return obj.get();
	
}
}