package com.dakhouch.anass.ecoadminapi.Service.Product_GaugeService;

import com.dakhouch.anass.ecoadminapi.Model.Product_gauge;
import com.dakhouch.anass.ecoadminapi.Repository.Product_GaugeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Product_GaugeServiceImpl implements Product_GaugeService{
    @Autowired
    Product_GaugeRepo product_gaugeRepo;

    @Override
    public Product_gauge save(Product_gauge product_gauge){
       return product_gaugeRepo.save(product_gauge);
    }

    @Override
    public void remove(Product_gauge product_gauge) {
        product_gaugeRepo.delete(product_gauge);
    }

    @Override
    public void removeAll(List<Product_gauge> product_gauges) {
        product_gaugeRepo.deleteAll(product_gauges);
    }

    @Override
    public List<Product_gauge> findByProduct(Long id) {
       return product_gaugeRepo.findByproduct(id);
    }

    @Override
    public List<Product_gauge> getAll() {
       return product_gaugeRepo.findAll();
    }
}
