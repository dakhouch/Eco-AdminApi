package com.dakhouch.anass.ecoadminapi.Service.SellService;

import com.dakhouch.anass.ecoadminapi.Model.Product;
import com.dakhouch.anass.ecoadminapi.Model.Sell;
import com.dakhouch.anass.ecoadminapi.Repository.SellRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellServiceImpl implements SellService{
@Autowired
    SellRepo sellRepo;
@Override
    public Sell saveSell(Sell product){
    return sellRepo.save(product);
}
@Override
public Sell sellProduct(Sell sell, Product product){
    product.setQuantity(product.getQuantity()-sell.getSellQuantity());
    sell.setProduct(product);
    return sellRepo.save(sell);
}

@Override
public List<Sell> getSellProducts() {
        return sellRepo.findAll();
    }

}
