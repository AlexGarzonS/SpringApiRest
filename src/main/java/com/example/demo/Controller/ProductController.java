package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ProductService;
import com.example.demo.model.ProductModel;


@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	private ProductService productoServices;
	
	@GetMapping
	public Collection<ProductModel> allProducts()
	{
		Collection<ProductModel> retornoProductos;
		retornoProductos = new ArrayList<ProductModel>();
		try {
			
		retornoProductos = productoServices.findAllProducts();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retornoProductos;
	}
}
