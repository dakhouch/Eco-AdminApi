package com.dakhouch.anass.ecoadminapi.Controller;

import com.dakhouch.anass.ecoadminapi.DTO.ProductGaugeDto;
import com.dakhouch.anass.ecoadminapi.Model.Product;
import com.dakhouch.anass.ecoadminapi.Model.Product_gauge;
import com.dakhouch.anass.ecoadminapi.Model.Sell;
import com.dakhouch.anass.ecoadminapi.Service.GaugeService.GaugeService;
import com.dakhouch.anass.ecoadminapi.Service.ProductService.ProductService;
import com.dakhouch.anass.ecoadminapi.Service.Product_GaugeService.Product_GaugeService;
import com.dakhouch.anass.ecoadminapi.Service.SellService.SellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin("http://localhost:3000/")
@RestController
public class ProductController {
    @Autowired
    ProductService productService;
    @Autowired
    Product_GaugeService product_gaugeService;
    @Autowired
    GaugeService gaugeService;
    @Autowired
    SellService sellService;

    @GetMapping("/getPendingProducts")
    public List<Product> getPendingProducts() {
       return productService.getAllPendingProducts();
    }
    @GetMapping("/getStockProducts")
    public List<Product> getStockProducts() {
        return productService.getAllStockProducts();
    }
    @GetMapping("/getSellProducts")
    public List<Sell> getSellProducts() {
        return sellService.getSellProducts();
    }
    @RequestMapping(value = "/addProduct",method = RequestMethod.POST)
    public Product addProduct(@RequestBody Product product){
       product.setInit_quantity(product.getQuantity());
        return productService.saveProduct(product);
    }

    @RequestMapping(value = "/addProduct_Gauge",method = RequestMethod.POST)
    public Product_gauge addProductGauge(@RequestBody ProductGaugeDto product_gauge){
        Product_gauge productgauge=new Product_gauge();
        productgauge.setProduct(productService.getProduct(product_gauge.getProduct_id()));
        productgauge.setValue(product_gauge.getValue());
        productgauge.setGauge(gaugeService.getGauge(product_gauge.getGauge_id()));
        System.out.println(product_gauge);
        return product_gaugeService.save(productgauge);
    }
    @RequestMapping(value = "/getProductGauges",method = RequestMethod.GET)
    public List<Product_gauge> getProductGauges() {
        return product_gaugeService.getAll();
    }
    @DeleteMapping("/deleteProduct/{id}")
    public  void deleteProduct(@PathVariable Long id){
        List<Product_gauge> product_gauges=product_gaugeService.findByProduct(id);
       product_gaugeService.removeAll(product_gauges);
        productService.deleteProduct(id);
    }
    @DeleteMapping("/deleteStockProduct/{id}")
    public  void deleteStockProduct(@PathVariable Long id){
      Product product=productService.getProduct(id);
       product.setQuantity((float) 0);
        productService.saveProduct(product);
    }
    @GetMapping("/toStock/{id}")
    public  void toStock(@PathVariable Long id){
   productService.toStock(id);
    }
    @RequestMapping(value = "/sellProduct",method = RequestMethod.POST)
    public Sell sellProduct(@RequestBody Sell product){
        return sellService.sellProduct(product,productService.getProduct(product.getProduct().getId()));
    }

}
