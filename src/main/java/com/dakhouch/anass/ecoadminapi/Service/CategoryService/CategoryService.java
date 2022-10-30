package com.dakhouch.anass.ecoadminapi.Service.CategoryService;

import com.dakhouch.anass.ecoadminapi.Model.Category;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CategoryService {

    Category saveCategory(Category category);
    void deleteCategory(Long id);
    List<Category> getAllCategories();
}
