package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Product;
import com.example.demo.repository.ProductRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepo;

	public List<Product> findAll() {
		return productRepo.findAll();
	}

	public Product findByID(Long id) {
		if (!productRepo.existsById(id)) {
			throw new EntityNotFoundException("Product does not exist.");
		}

		return productRepo.findById(id).get();
	}

	public Product create(Product p) {
		productRepo.save(p);
		return p;
	}

	public Product update(Product p) {
		
		if (!productRepo.existsById(p.getId())) {
			throw new EntityNotFoundException("Product does not exist.");
		}

		productRepo.save(p);
		return p;
	}

	public void delete(Long id) {
		if (!productRepo.existsById(id)) {
			throw new EntityNotFoundException("Product does not exist.");
		}
		
		productRepo.deleteById(id);
		
	}
}
