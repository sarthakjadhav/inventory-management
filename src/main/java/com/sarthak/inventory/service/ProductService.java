package com.sarthak.inventory.service;

import com.sarthak.inventory.entity.Product;
import com.sarthak.inventory.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public String getProductName(Long id){
        Optional<Product> optionalProduct = productRepository.findById(id);

        if (optionalProduct.isPresent()) {
            return optionalProduct.get().getName(); // Safely gets the name if it exists
        } else {
            return "Product not found with ID: " + id; // Safe string fallback instead of a crash
        }
    }

    public void saveProduct(Product product){
        productRepository.save(product);
    }
}
