package com.dakhouch.anass.ecoadminapi.Controller;

import com.dakhouch.anass.ecoadminapi.Model.Category;
import com.dakhouch.anass.ecoadminapi.Service.CategoryService.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("http://localhost:3000/")
@RestController
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping(value = "/addCategory",method = RequestMethod.POST)
    public Category addCategory(@RequestBody Category category ){
        return categoryService.saveCategory(category);
    }


    @RequestMapping(value = "/deleteCategory/{id}",method = RequestMethod.DELETE)
    public void deleteCategory(@PathVariable Long id){categoryService.deleteCategory(id);}

    @RequestMapping(value = "/getCategories",method = RequestMethod.GET)
    public List<Category> getCategories(){
        return categoryService.getAllCategories();
    }
}
