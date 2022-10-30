package com.dakhouch.anass.ecoadminapi.Service.CategoryService;

import com.dakhouch.anass.ecoadminapi.Model.Category;
import com.dakhouch.anass.ecoadminapi.Repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    CategoryRepo categoryRepo;

    @Override
    public  Category saveCategory(Category category){
        return categoryRepo.save(category);
    }

    @Override
    public void deleteCategory(Long id) {
        categoryRepo.deleteById(id);
    }
    @Override
    public List<Category> getAllCategories(){
        return  categoryRepo.findAll();
    }
}
