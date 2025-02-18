package com.example.MyCart.Controller;

import com.example.MyCart.entity.Products;
import com.example.MyCart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Products> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Optional<Products> getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @PostMapping
    public Products addProduct(@RequestBody Products products) {
        return productService.addProduct(products);
    }

//    @PutMapping("/{id}")
//    public Products updateProduct(@PathVariable Long id, @RequestBody Products products) {
//        return productService.updateProduct(id, products);
//    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }
}
