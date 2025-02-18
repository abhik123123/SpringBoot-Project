package com.example.MyCart.service;

import com.example.MyCart.entity.Products;
import com.example.MyCart.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Products> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Products> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public Products addProduct(Products products) {
        return productRepository.save(products);
    }

//    public Products updateProduct(Long id, Products updatedProduct) {
//        return productRepository.findById(id).map(existingProduct -> {
//            existingProduct.setPtitle(updatedProduct.getPtitle());
//            existingProduct.setPdesc(updatedProduct.getPdesc());
//            existingProduct.setPphoto(updatedProduct.getPphoto());
//            existingProduct.setPprice(updatedProduct.getPprice());
//            existingProduct.setPdiscount(updatedProduct.getPdiscount());
//            existingProduct.setPquantity(updatedProduct.getPquantity());
//            existingProduct.setCategory(updatedProduct.getCategory());
//            return productRepository.save(existingProduct);
//        }).orElseThrow(() -> new RuntimeException("Product with ID " + id + " not found"));
//    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
