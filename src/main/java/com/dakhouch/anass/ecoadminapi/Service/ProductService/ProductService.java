package com.dakhouch.anass.ecoadminapi.Service.ProductService;

import com.dakhouch.anass.ecoadminapi.Model.Product;

import java.util.List;

public interface ProductService {
    public Product saveProduct(Product product);
    public Product getProduct(Long id);
    public void  deleteProduct(Long id);
    public void toStock(Long id);
    public List<Product>getAllPendingProducts();
    public List<Product>getAllStockProducts();
}
