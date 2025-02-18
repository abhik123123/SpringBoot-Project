package com.example.MyCart.service;

import com.example.MyCart.entity.Category;
import com.example.MyCart.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Optional<Category> getCategoryById(Long id) {
        return categoryRepository.findById(id);
    }

    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }

//    public Category updateCategory(Long id, Category updatedCategory) {
//        return categoryRepository.findById(id).map(category -> {
//            category.setCategoryTitle(updatedCategory.getCategoryTitle());
//            category.setCategoryDescription(updatedCategory.getCategoryDescription());
//            return categoryRepository.save(category);
//        }).orElseThrow(() -> new RuntimeException("Category not found with ID: " + id));
//    }

    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}
