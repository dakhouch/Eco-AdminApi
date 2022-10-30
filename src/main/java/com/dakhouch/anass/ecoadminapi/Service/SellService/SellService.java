package com.dakhouch.anass.ecoadminapi.Service.SellService;

import com.dakhouch.anass.ecoadminapi.Model.Product;
import com.dakhouch.anass.ecoadminapi.Model.Sell;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface SellService {
    public Sell saveSell(Sell product);
    public Sell sellProduct(Sell sell,Product product);

    public List<Sell> getSellProducts();
}
