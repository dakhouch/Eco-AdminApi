package com.dakhouch.anass.ecoadminapi.Service.ProductService;

import com.dakhouch.anass.ecoadminapi.Model.Product;
import com.dakhouch.anass.ecoadminapi.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepo productRepo;
    @Override
    public Product saveProduct(Product product){
        return productRepo.save(product);
    }
    @Override
    public void deleteProduct(Long id){
        productRepo.deleteById(id);
    }
    @Override
    public void toStock(Long id){
        Product product=productRepo.findById(id).get();
        product.setStatus("stock");
        productRepo.save(product);
    }
    @Override
    public List<Product> getAllPendingProducts(){
        return productRepo.getAllPending();
    }
    @Override
    public List<Product> getAllStockProducts(){
        return productRepo.getAllStock();
    }
    @Override
    public  Product getProduct(Long id){
        return productRepo.findById(id).get();
    }
}
