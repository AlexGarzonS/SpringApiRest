package com.example.demo.Service;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.ProductRepo;
import com.example.demo.model.ProductModel;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepo productRepository;
	
	
	public Collection<ProductModel> findAllProducts()
	{
		Collection<ProductModel> retornoLista;
		
		retornoLista = new ArrayList<ProductModel>();
		
		try {
			retornoLista = productRepository.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retornoLista;
	}
	
}
