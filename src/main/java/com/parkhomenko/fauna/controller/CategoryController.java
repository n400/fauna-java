package com.parkhomenko.fauna.controller;

import com.parkhomenko.fauna.model.Category;
import com.parkhomenko.fauna.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
public class CategoryController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @RequestMapping("/categories")
    public List<Category> getCategories() throws ExecutionException, InterruptedException {
        return categoryService.getCategories();
    }
}
