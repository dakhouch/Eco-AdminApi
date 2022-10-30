package com.dakhouch.anass.ecoadminapi.Service.Product_GaugeService;

import com.dakhouch.anass.ecoadminapi.Model.Product_gauge;

import java.util.List;

public interface Product_GaugeService {
    Product_gauge save(Product_gauge product_gauge);
    void remove(Product_gauge product_gauge);
    void removeAll(List<Product_gauge> product_gauges);
    List<Product_gauge> findByProduct(Long id);

    List<Product_gauge> getAll();

}

